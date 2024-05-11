package net.ezra.ui.python


import android.content.Intent
import android.content.res.Configuration
import android.graphics.drawable.Icon
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_HTML
import net.ezra.navigation.ROUTE_PYTHON




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PythonScreen(navController: NavHostController) {



    Column {
        Row {
            Text(text = "Python Courses", fontSize = 30.sp)

            Spacer(modifier = Modifier.width(50.dp))


            OutlinedButton(onClick = {

                navController.navigate(ROUTE_HOME) {
                    popUpTo(ROUTE_HTML) { inclusive = true }
                }

            }) {

                Text(text = "Home Page", color = Color.Black)

            }
        }




        Box {
            Image(
                painter = painterResource(id = R.drawable.imge),
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                PythonLessonCard(
                    lessonTitle = "Lesson 1: Introduction to Python",
                    icon = painterResource(id = R.drawable.book3),
                    url = "https://www.davekuhlman.org/python_book_01.pdf", // URL for UI/UX courses
                    navController = navController
                )
                PythonLessonCard(
                    lessonTitle = "Lesson 2: python basics",
                    icon = painterResource(id = R.drawable.book3),
                    url = "https://static.realpython.com/python-basics-sample-chapters.pdf", // URL for UI/UX courses
                    navController = navController
                )
                PythonLessonCard(
                    lessonTitle = "Lesson 3: Think python",
                    icon = painterResource(id = R.drawable.book3),
                    url = "https://www.greenteapress.com/thinkpython/thinkpython.pdf", // URL for UI/UX courses
                    navController = navController
                )
                PythonLessonCard(
                    lessonTitle = "Lesson 4: python handbook",
                    icon = painterResource(id = R.drawable.book3),
                    url = "https://www.webdesign.org/downloads/Beginners_Guide_to_HTML.pdf", // URL for UI/UX courses
                    navController = navController
                )
            }
        }



    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    PythonScreen(rememberNavController())
}

@Composable
fun PythonLessonCard(lessonTitle: String, icon: Painter,  url: String, navController: NavHostController) {
    Spacer(modifier = Modifier.height(16.dp))
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Black)
                .padding(16.dp), // Added padding to the Row
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = icon,
                contentDescription = null,
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = lessonTitle,
                color = Color.White
            )
            Spacer(modifier = Modifier.width(16.dp))

            OutlinedButton(
                onClick = {
                    // Launch intent to open web URL
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                    navController.context.startActivity(intent)
                },
                modifier = Modifier.align(Alignment.CenterVertically)
            ){
                Text(text = "Study", color = Color.White
                )
            }
        }
    }
}