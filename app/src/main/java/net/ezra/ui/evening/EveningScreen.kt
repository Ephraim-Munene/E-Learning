package net.ezra.ui.evening

//import android.os.Build.VERSION_CODES.R
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import net.ezra.R
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HTML
import net.ezra.navigation.ROUTE_SHOP


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EveningScreen(navController: NavHostController) {


    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center // Align content to the center
    ) {
        Image(
            painter = painterResource(id = R.drawable.imge),
            contentDescription = "Background Image",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        var logInUsername by rememberSaveable {
            mutableStateOf("")
        }

        var logInPassword by rememberSaveable {
            mutableStateOf("")
        }

        Column(
            horizontalAlignment = Alignment.CenterHorizontally, // Center horizontally
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Solo Learn", fontSize = 50.sp, color = Color.Black)
            Spacer(modifier = Modifier.height(90.dp))
            OutlinedTextField(
                value = logInUsername,
                onValueChange = { logInUsername = it },
                label = { Text(text = "Username", color = Color.Black) },
                modifier = Modifier
                    .fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Black,
                    unfocusedBorderColor = Color.Black,
                    cursorColor = Color.Black,
                )
            )

            OutlinedTextField(
                value = logInPassword,
                onValueChange = { logInPassword = it },
                label = { Text(text = "Password", color = Color.Black) },
                modifier = Modifier
                    .fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Black,
                    unfocusedBorderColor = Color.Black,
                    cursorColor = Color.Black,
                )
            )

            OutlinedButton(
                onClick = {
                    // Handle login button click
                }
            ) {
                Text(text = "Login", color = Color.Black)
            }

            var signUpUsername by rememberSaveable {
                mutableStateOf("")
            }

            var signUpPassword by rememberSaveable {
                mutableStateOf("")
            }
            Text(text = "If you dont have an account sign up for one below")

            OutlinedTextField(
                value = signUpUsername,
                onValueChange = { signUpUsername = it },
                label = { Text(text = "Username", color = Color.Black) },
                modifier = Modifier
                    .fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Black,
                    unfocusedBorderColor = Color.Black,
                    cursorColor = Color.Black,
                )
            )

            OutlinedTextField(
                value = signUpPassword,
                onValueChange = { signUpPassword = it },
                label = { Text(text = "Password", color = Color.Black) },
                modifier = Modifier
                    .fillMaxWidth(),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Color.Black,
                    unfocusedBorderColor = Color.Black,
                    cursorColor = Color.Black,
                )
            )

            OutlinedButton(
                onClick = {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_EVENING) { inclusive = true }
                    }
                }
            ) {
                Text(text = "Sign Up", color = Color.Black)
            }
            Spacer(modifier = Modifier.height(90.dp))


            Text(text = "Terms and Conditions apply ", fontSize = 20.sp,color = Color.Black)
        }
    }



}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    EveningScreen(rememberNavController())
}