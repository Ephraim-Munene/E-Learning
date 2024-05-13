package net.ezra.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.SplashScreen
import net.ezra.ui.UiDesign.TestScreen
import net.ezra.ui.about.AboutScreen
import net.ezra.ui.UiDesign.Ui2Screen
import net.ezra.ui.UiDesign.Ui3Screen
import net.ezra.ui.UiDesign.Ui4Screen
import net.ezra.ui.UiDesign.UiScreen
import net.ezra.ui.des1.DesScreen
import net.ezra.ui.des2.Des2Screen
import net.ezra.ui.des3.Des3Screen
import net.ezra.ui.des4.Des4Screen
import net.ezra.ui.evening.EveningScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.html.HtmlScreen
import net.ezra.ui.htmlDes.Ht1Screen
import net.ezra.ui.htmlDes.Ht2Screen
import net.ezra.ui.htmlDes.Ht3Screen
import net.ezra.ui.htmlDes.HtScreen
import net.ezra.ui.java.JavaScreen
import net.ezra.ui.javaDes.JavaDes2Screen
import net.ezra.ui.javaDes.JavaDes3Screen
import net.ezra.ui.javaDes.JavaDes4Screen
import net.ezra.ui.javaDes.JavaDesScreen
import net.ezra.ui.login.LoginScreen
import net.ezra.ui.python.PythonScreen
import net.ezra.ui.registration.SignUpScreen
import net.ezra.ui.students.AddStudents

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH,
) {
    BackHandler {
        navController.popBackStack()
    }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {

        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUTE_HTML) {
            HtmlScreen(navController)
        }
        composable(ROUTE_PYTHON) {
            PythonScreen(navController)
        }
        composable(ROUTE_LOGIN) {
            LoginScreen(navController = navController){}
        }
        composable(ROUTE_REGISTER) {
            SignUpScreen(navController = navController) { }
        }

        composable(ROUTE_JAVA) {
            JavaScreen(navController)
        }
        composable(ROUTE_EVENING) {
            EveningScreen(navController)
        }
        composable(ROUTE_ADD_STUDENTS) {
            AddStudents(navController)
        }
        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }
        composable(ROUTE_PYDES) {
            DesScreen(navController)
        }
        composable(ROUTE_PYDES2) {
            Des2Screen(navController)
        }
        composable(ROUTE_PYDES3) {
            Des3Screen(navController)
        }

        composable(ROUTE_PYDES4) {
            Des4Screen(navController)
        }
        composable(ROUTE_JVDES) {
            JavaDesScreen(navController)
        }
        composable(ROUTE_JVDES2) {
            JavaDes2Screen(navController)
        }
        composable(ROUTE_JVDES3) {
            JavaDes3Screen(navController)
        }
        composable(ROUTE_JVDES4) {
            JavaDes4Screen(navController)
        }
        composable(ROUTE_HTDES1) {
            HtScreen(navController)
        }
        composable(ROUTE_HTDES2) {
            Ht1Screen(navController)
        }
        composable(ROUTE_HTDES3) {
            Ht2Screen(navController)
        }
        composable(ROUTE_UIDES) {
            UiScreen(navController)
        }
        composable(ROUTE_UIDES2) {
            Ui2Screen(navController)
        }
        composable(ROUTE_UIDES3) {
            Ui3Screen(navController)
        }
        composable(ROUTE_DESIGNSCREEN) {
            Ui4Screen(navController)
        }
        composable(ROUTE_TEST) {
            TestScreen(navController)
        }

    }
}
