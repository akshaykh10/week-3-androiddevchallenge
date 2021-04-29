package com.example.bloom

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigate
import androidx.navigation.compose.rememberNavController
import com.example.bloom.ui.theme.BloomTheme
import com.example.bloom.utils.Screen
import com.example.bloom.views.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Render under the status and navigation bars.
        WindowCompat.setDecorFitsSystemWindows(window, false)


        setContent {
            BloomTheme{
                NavigationHost()
            }
        }
    }
}

@Composable
fun NavigationHost()
{
    val navController= rememberNavController()
    NavHost(navController = navController, startDestination ="WelcomeScreen" ){
        composable("WelcomeScreen"){
            WelcomeScreen(onClick = { navController.navigate("LoginScreen") })
        }
        composable("LoginScreen"){
            LoginScreen(onClick={navController.navigate("MainScreen") })

        }

        composable("MainScreen")
        {

            MainScreen()


        }

    }
}

