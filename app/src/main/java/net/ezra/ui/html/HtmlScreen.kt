package net.ezra.ui.html


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
fun HtmlScreen(navController: NavHostController) {



    Column {
        Row {
            Text(text = "Html Courses", fontSize = 30.sp)

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
                    lessonTitle = "Lesson 1: Introduction to Html",
                    icon = painterResource(id = R.drawable.book3),
                            url = "https://www.webdesign.org/downloads/Beginners_Guide_to_HTML.pdf", // URL for UI/UX courses
                    navController = navController
                )
                PythonLessonCard(
                    lessonTitle = "Lesson 2: Html handbook",
                    icon = painterResource(id = R.drawable.book3),
                            url = "https://www.dbooks.org/the-html-handbook-5614163748/read/", // URL for UI/UX courses
                    navController = navController
                )
                PythonLessonCard(
                    lessonTitle = "Lesson 3: Html5 notes",
                    icon = painterResource(id = R.drawable.book3),
                            url = "https://www.goalkicker.com/HTML5Book/", // URL for UI/UX courses
                    navController = navController
                )
                PythonLessonCard(
                    lessonTitle = "Lesson 4: The Use of grids",
                    icon = painterResource(id = R.drawable.book3),
                            url = "https://www.syncfusion.com/succinctly-free-ebooks/twitterbootstrap4-succinctly/the-grids-the-grids-the-beautiful-grids", // URL for UI/UX courses
                    navController = navController
                )
            }
        }



    }

}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    HtmlScreen(rememberNavController())
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
            OutlinedButton(
                onClick = {
                    // Launch intent to open web URL
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                    navController.context.startActivity(intent)
                },
                modifier = Modifier.align(Alignment.CenterVertically)
            ){
                Text(text = "Html Book", color = Color.White
                )
            }
        }
    }
}