package com.soknan.umeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.soknan.umeapp.datas.Screen
import com.soknan.umeapp.screens.HomeScreen
import com.soknan.umeapp.ui.theme.MyAssignmentTheme
import androidx.navigation.compose.composable
import com.soknan.umeapp.screens.CppGetStarted


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            NavHost (
                navController = navController,
                startDestination = Screen.Home.route
            ){
                composable(Screen.Home.route){
                    HomeScreen(navController = navController)
                }
                composable(Screen.CppGetStarted.route){
                    CppGetStarted(navController = navController)
                }
            }

        }
    }
}

