package net.ezra.ui.des1

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import net.ezra.R
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME


@Composable
fun DesScreen(navController: NavHostController) {
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
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.White)
        ) {
//        Image(
//            painter = painterResource(id = R.drawable.imge),
//            contentDescription = "",
//            modifier = Modifier.fillMaxSize(),
//            contentScale = ContentScale.Crop
//        )
            Spacer(modifier = Modifier.height(50.dp))


            LazyColumn {
                item {

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp)
                    ) {
                        BookCard(
                            bookTitle = "Book 1",
                            what = "what is the book About",
                            bookDescription = "Embark on a journey into Python programming with this comprehensive introduction. " +
                                    "From basic syntax to advanced concepts, this book provides clear explanations, practical examples, " +
                                    "and hands-on exercises. Whether you're a beginner or looking to solidify your skills, this resource equips you with the knowledge and co" +
                                    "nfidence to navigate Python's versatile capabilities effectively and embark on your coding adventures.",
                            imageResId = R.drawable.java,
                            url = "https://www.davekuhlman.org/python_book_01.pdf", // URL for UI/UX courses
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
                .padding(16.dp)
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
    DesScreen(navController = rememberNavController())
}

