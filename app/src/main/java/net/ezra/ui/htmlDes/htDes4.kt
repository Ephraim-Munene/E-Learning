package net.ezra.ui.htmlDes


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
fun Ht3Screen(navController: NavHostController) {
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
        modifier = Modifier
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
                Spacer(modifier = Modifier.height(30.dp))


                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    BookCard1(
                        bookTitle = "Book 1",
                        what = "what is the book About",
                        bookDescription = "Transform your ideas into captivating web experiences with our HTML manual. Whether you're a novice or an experienced developer, " +
                                "this book offers valuable insights and best practices for designing and coding web pages." +
                                " From simple layouts to complex structures, unleash your creativity and bring your vision to life on the web.",
                        imageResId = R.drawable.java,
                        url = "https://www.syncfusion.com/succinctly-free-ebooks/twitterbootstrap4-succinctly/the-grids-the-grids-the-beautiful-grids", // URL for UI/UX courses
                        navController = navController,
                        presetRating = 4 // Specify the preset rating here
                    )

                }

            }
        }
    }

    }
}
