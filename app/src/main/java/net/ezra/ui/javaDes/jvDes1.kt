package net.ezra.ui.javaDes

import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.FileProvider
import net.ezra.R
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.Firebase
import com.google.firebase.storage.storage
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import java.io.File


@Composable
fun JavaDesScreen(navController: NavHostController) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {
//                    IconButton(onClick = { /* do something */ }) {
//                        Icon(Icons.Filled.Check, contentDescription = "Localized description")
//                    }
//                    IconButton(onClick = { /* do something */ }) {
//                        Icon(
//                            Icons.Filled.Edit,
//                            contentDescription = "Localized description",
//                        )
//                    }
                    Spacer(modifier = Modifier.width(150.dp))
                    IconButton(onClick = { navController.navigate(ROUTE_HOME) }) {
                        Icon(
                            Icons.Filled.Home,
                            contentDescription = "Localized description",
                        )
                    }
//                    IconButton(onClick = { /* do something */ }) {
//                        Icon(
//                            Icons.Filled.Person,
//                            contentDescription = "Localized description",
//                        )
//                    }
                },
//                floatingActionButton = {
//                    FloatingActionButton(
//                        onClick = { /* do something */ },
//                        containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
//                        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
//                    ) {
//                        Icon(Icons.Filled.Add, "Localized description")
//                    }
//                }
            )
        },
    ) { innerPadding ->
        Text(
            modifier = Modifier.padding(innerPadding),
            text = "Example of a scaffold with a bottom app bar."
        )
        Box (
            modifier  = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        ){
//        Image(
//            painter = painterResource(id = R.drawable.imge),
//            contentDescription = "",
//            modifier = Modifier.fillMaxSize(),
//            contentScale = ContentScale.Crop
//        )
            LazyColumn {
                item {
                    Spacer(modifier = Modifier.height(50.dp))


                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        BookCard(
                            bookTitle = "Book 1",
                            what = "what is the book About",
                            bookDescription = "Empower your coding journey with our Java handbook. Whether you're new to programming or looking to expand your skills," +
                                    " this book offers a comprehensive overview of Java development. With practical examples and insightful explanations, " +
                                    "you'll learn how to write clean, efficient code and build powerful applications in Java.",
                            imageResId = R.drawable.java,
                            url = "https://firebasestorage.googleapis.com/v0/b/final-1424d.appspot.com/o/Learn%20Java%20in%20One%20Day%20and%20Learn%20It%20Well%20-%20PDF%20Room.pdf?alt=media&token=f0698c22-032b-49e8-8c44-8c1fe82bca56", // URL for UI/UX courses
                            navController = navController,
                            presetRating = 4 // Specify the preset rating here
                        )

                    }

                }
            }
        }
    }

}

@Composable
fun BookCard(
    bookTitle: String,
    what: String,
    bookDescription: String,
    imageResId: Int,
    navController: NavHostController,
    url: String,
    presetRating: Int // New parameter for preset rating
) {
    var userRating by remember { mutableStateOf(presetRating) } // Use the preset rating


    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { /* Navigate to book details screen */ },
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(1.dp)
                .background(color = Color.White)

        ) {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = bookTitle,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .graphicsLayer(clip = true)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = bookTitle,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(8.dp))
            RatingBar(
                rating = userRating,
                onRatingChanged = { newRating -> userRating = newRating }
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = what,
                color = Color.Black,
                fontSize = 30.sp

            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = bookDescription,
                color = Color.Black,
                fontSize = 15.sp
            )


            OutlinedButton(
                onClick = {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                    navController.context.startActivity(intent)
                },
            ) {
                Text(text = "View Course", color = Color.Black)
            }
        }
    }
    val storageRef = Firebase.storage.getReferenceFromUrl(url)

    LaunchedEffect(key1 = storageRef) {
        try {
            val localFile = File.createTempFile("tempFile", ".pdf")
            storageRef.getFile(localFile).addOnSuccessListener {
                val pdfUri = FileProvider.getUriForFile(
                    navController.context,
                    navController.context.packageName + ".provider",
                    localFile
                )
                val intent = Intent(Intent.ACTION_VIEW).apply {
                    setDataAndType(pdfUri, "application/pdf")
                    addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                }
                navController.context.startActivity(intent)
            }.addOnFailureListener { exception ->
                Log.e("BookCard", "Error downloading PDF: $exception")
                // Handle failure
            }
        } catch (e: Exception) {
            Log.e("BookCard", "Error creating temp file: $e")
            // Handle exception
        }
    }
}

@Composable
fun RatingBar(
    rating: Int,
    onRatingChanged: (Int) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("Rate: ")
        (1..5).forEach { index ->
            val isSelected = index <= rating
            Icon(
                painter = if (isSelected) {
                    painterResource(id = R.drawable.star4)
                } else {
                    painterResource(id = R.drawable.star4)
                },
                contentDescription = null,
                modifier = Modifier
                    .clickable { onRatingChanged(index) }
                    .padding(2.dp)
            )
        }
    }
}


@Preview
@Composable
fun DesScreenPreview() {
    JavaDesScreen(navController = rememberNavController())
}


