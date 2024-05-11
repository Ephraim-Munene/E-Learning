package net.ezra.ui.home

import android.content.Intent
import android.net.Uri
import android.view.Surface
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_DESIGN
import net.ezra.navigation.ROUTE_DESIGNSCREEN
import net.ezra.navigation.ROUTE_HTDES1
import net.ezra.navigation.ROUTE_HTDES2
import net.ezra.navigation.ROUTE_HTDES3
import net.ezra.navigation.ROUTE_HTDES4
import net.ezra.navigation.ROUTE_HTML
import net.ezra.navigation.ROUTE_JAVA
import net.ezra.navigation.ROUTE_JVDES
import net.ezra.navigation.ROUTE_JVDES2
import net.ezra.navigation.ROUTE_JVDES3
import net.ezra.navigation.ROUTE_JVDES4
import net.ezra.navigation.ROUTE_PYDES
import net.ezra.navigation.ROUTE_PYDES2
import net.ezra.navigation.ROUTE_PYDES3
import net.ezra.navigation.ROUTE_PYDES4
import net.ezra.navigation.ROUTE_PYTHON
import net.ezra.navigation.ROUTE_UIDES
import net.ezra.navigation.ROUTE_UIDES2
import net.ezra.navigation.ROUTE_UIDES3

@Composable
fun HomeScreen(navController: NavHostController) {




    Box (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ){
//        Image(painter = painterResource(id = R.drawable.imge), contentDescription = "",
//            modifier = Modifier
//                .fillMaxSize(),
//
//            contentScale = ContentScale.Crop
//        )



        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
//                .padding(10.dp)
                .padding(top = 10.dp)

        ){
            Spacer(modifier = Modifier.height(30.dp))

            Row{

                    Text(text = "LEARN", fontSize = 35.sp,color = Color.Black)
                Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "CODING", fontWeight = FontWeight.Bold,color = Color.Black, fontSize = 35.sp)


                Image(painter = painterResource(id = R.drawable.book3), contentDescription = "")
            }
//
//
//            LazyRow (
//                modifier = Modifier
//                    .background(Color.White)
//                    .fillMaxWidth()
//            ){
//
//                item {
//                    OutlinedButton(onClick = {
//
//                        navController.navigate(ROUTE_DESIGN) {
//                            popUpTo(ROUTE_HOME) { inclusive = true }
//                        }
//
//                    }) {
//
//                        Text(text = "UI/UX Design", color = Color.Black)
//
//                    }
//
//                    Spacer(modifier = Modifier.width(5.dp))
//
//                    OutlinedButton(onClick = {
//
//                        navController.navigate(ROUTE_PYTHON) {
//                            popUpTo(ROUTE_HOME) { inclusive = true }
//                        }
//
//                    }) {
//
//                        Text(text = "Python", color = Color.Black)
//
//                    }
//
//                    Spacer(modifier = Modifier.width(5.dp))
//
//                    OutlinedButton(onClick = {
//
//                        navController.navigate(ROUTE_JAVA) {
//                            popUpTo(ROUTE_HOME) { inclusive = true }
//                        }
//
//                    }) {
//
//                        Text(text = "Java", color = Color.Black)
//
//                    }
//
//                    Spacer(modifier = Modifier.width(5.dp))
//
//                    OutlinedButton(onClick = {
//
//                        navController.navigate(ROUTE_HTML) {
//                            popUpTo(ROUTE_HOME) { inclusive = true }
//                        }
//
//                    }) {
//
//                        Text(text = "Html", color = Color.Black)
//
//                    }
//
//
//
//
//
//                }
//
//
//
//            }

            Spacer(modifier = Modifier.height(20.dp))


                LazyColumn {
                    item {
                        Text(text = "UI/UX Courses", fontSize = 25.sp,fontWeight = FontWeight.Bold)
                        Row  (
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            LazyRow {
                                item {
                                    Card(
                                        lessonTitle = "UI/UX Courses",
                                        description = "Discover the principles of effective UI/UX design and elevate your digital creations to new heights.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.enam),
                                        destination = ROUTE_UIDES, // Provide the destination route
                                        navController = navController,
//                                    isCircle = true
                                    )

                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        lessonTitle = "UI/UX Courses",
                                        description = "Master the art of crafting seamless user experiences with this essential handbook for designers.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.book11),
                                        destination = ROUTE_UIDES2, // Provide the destination route
                                        navController = navController,
//                                    isCircle = true
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        lessonTitle = "UI/UX Courses",
                                        description = "Unlock the secrets of user-centric design through insightful case studies and expert strategies.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.shutter),
                                        destination = ROUTE_UIDES3, // Provide the destination route
                                        navController = navController
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        lessonTitle = "UI/UX Courses",
                                        description = "A comprehensive guide to creating intuitive interfaces, blending theory with practical design principles",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.book12),
                                        destination = ROUTE_DESIGNSCREEN, // Provide the destination route
                                        navController = navController
                                    )
                                }
                            }
                        }


                        Text(text = "Python courses", fontSize = 25.sp,fontWeight = FontWeight.Bold)

                        Row   (
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            LazyRow{
                                item{
                                    Card(
                                        lessonTitle = "Explore Various Python Courses",
                                        description = "Comprehensive guide to Python: from basics to advanced topics, with practical examples and exercises.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.vector),
                                        destination = ROUTE_PYDES, // Provide the destination route
                                        navController = navController,
//                                    isCircle = true
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        lessonTitle = "Explore Various Python Courses",
                                        description = "Python mastery: Learn algorithms, data structures, and best practices through hands-on projects and challenges.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.book9),
                                        destination = ROUTE_PYDES2, // Provide the destination route
                                        navController = navController,
//                                    isCircle = true
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        lessonTitle = "Explore Various Python Courses",
                                        description = "Python programming demystified: clear explanations, concise code snippets, and real-world applications for beginners.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.book9),
                                        destination = ROUTE_PYDES3, // Provide the destination route

                                        navController = navController,
//                                    isCircle = true
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        lessonTitle = "Explore Various Python Courses",
                                        description = "Unlock the power of Python: dive into libraries, frameworks, and tools for web development and more.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.black),
                                        destination = ROUTE_PYDES4, // Provide the destination route

                                        navController = navController,
//                                    isCircle = true
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))

                                }
                            }
                        }


                        Text(text = "Java Courses", fontSize = 25.sp,fontWeight = FontWeight.Bold)

                        Row   (
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            LazyRow {
                                item {
                                    Card(
                                        lessonTitle = "Explore Various Java Courses",
                                        description = "Java essentials: from syntax fundamentals to object-oriented programming, with code samples and exercises.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.book11),
                                        destination = ROUTE_JVDES, // Provide the destination route

                                        navController = navController
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))

                                    Card(
                                        lessonTitle = "Explore Various Java Courses",
                                        description = "Mastering Java: Explore advanced topics like multithreading, networking, and GUI development with real-world examples.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.book9),
                                        destination = ROUTE_JVDES2, // Provide the destination route

                                        navController = navController
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        lessonTitle = "Explore Various Java Courses",
                                        description = "Java programming simplified: Step-by-step tutorials, practical tips, and projects for beginners to build strong foundations.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.book9),
                                        destination = ROUTE_JVDES3, // Provide the destination route

                                        navController = navController
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        lessonTitle = "Explore Various Java Courses",
                                        description = "Java in action: Dive into enterprise-level Java development, covering frameworks, design patterns, and best practices.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.vector),
                                        destination = ROUTE_JVDES4, // Provide the destination route

                                        navController = navController
                                    )

                                    Spacer(modifier = Modifier.width(20.dp))



                                }
                            }
                        }




                        Text(text = "Html Courses", fontSize = 25.sp,fontWeight = FontWeight.Bold)
                        Row   (
                            modifier = Modifier
                                .fillMaxWidth()
                        ){
                            LazyRow {
                                item {
                                    Card(
                                        lessonTitle = "Explore the Html Courses",
                                        description = "HTML basics: Learn tags, attributes, and structure with hands-on exercises and beginner-friendly examples.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.book12),
                                        destination = ROUTE_HTDES1, // Provide the destination route

                                        navController = navController,
//                                            isCircle = true // This card will be displayed as a circle

                                    )
                                    Spacer(modifier = Modifier.width(20.dp))

                                    Card(
                                        lessonTitle = "Explore the Html Courses",
                                        description = "HTML mastery: Harness the power of CSS and JavaScript integration for dynamic and responsive web development.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.book9),
                                        destination = ROUTE_HTDES2, // Provide the destination route

                                        navController = navController,
//                                    isCircle = true
                                    )
                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        lessonTitle = "Explore the Html Courses",
                                        description = "Creating web content with HTML: Dive into forms, multimedia, and semantic elements for modern web design.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.vector),
                                        destination = ROUTE_HTDES3, // Provide the destination route

                                        navController = navController,
//                                    isCircle = true
                                    )

                                    Spacer(modifier = Modifier.width(20.dp))


                                    Card(
                                        lessonTitle = "Explore the Html Courses",
                                        description = "Building websites from scratch: Master HTML5 features, accessibility standards, and SEO techniques for professional sites.",
                                        icon = painterResource(id = R.drawable.book3),
                                        image = painterResource(id = R.drawable.enam),
                                        destination = ROUTE_HTDES4, // Provide the destination route

                                        navController = navController,
//                                    isCircle = true
                                    )

                                    Spacer(modifier = Modifier.width(20.dp))

                                }
                            }

                        }










                    }
                }
            // Bottom navigation
            BottomNavigation(
                modifier = Modifier
                    .fillMaxWidth()
                .background(color = Color.White)
            ) {
                BottomNavigationItem(
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.home),
                            contentDescription = "Home"
                        )
                    },
                    label = { Text(text = "Home") },
                    selected = false, // Change this according to your current destination
                    onClick = {
                        // Navigate to home screen
                        navController.navigate(ROUTE_HOME) {
                            // Add any navigation options if needed
                        }
                    }
                )

                BottomNavigationItem(
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.book3),
                            contentDescription = "About"
                        )
                    },
                    label = { Text(text = "About") },
                    selected = false, // Change this according to your current destination
                    onClick = {
                        // Navigate to about screen
                        navController.navigate(ROUTE_ABOUT) {
                            // Add any navigation options if needed
                        }
                    }
                )

                // Add more BottomNavigationItem for additional destinations
            }








        }
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}
@Composable
fun Card(
    lessonTitle: String,
    description: String,
    icon: Painter,
    image: Painter,
    destination: String,
    navController: NavHostController
) {
    Spacer(modifier = Modifier.height(16.dp))
    Card(
        modifier = Modifier
            .width(350.dp) // Set a fixed width for the card
            .padding(horizontal = 8.dp) // Add padding to reduce card size horizontally
    ) {
        Column(
            modifier = Modifier
                .background(color = Color.White)
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp) // Add padding around the image
                    .height(150.dp), // Reduce the height of the image
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(8.dp)) // Reduce vertical spacing
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Row {

                        Icon(
                            painter = icon,
                            contentDescription = null,
                            tint = Color.Black,
                            modifier = Modifier.size(24.dp)
                        )
                        Spacer(modifier = Modifier.width(8.dp)) // Reduce horizontal spacing
                        Text(
                            text = lessonTitle,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.width(8.dp)) // Reduce horizontal spacing
                    Text(
                        text = description,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.width(8.dp)) // Reduce horizontal spacing
                    OutlinedButton(
                        onClick = {
                            navController.navigate(destination)
                        },
//                        modifier = Modifier.align(Alignment.CenterVertically)
                    ){
                        Text(text = "View Course", color = Color.Black)
                    }
                }



            }
        }
    }
}





