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
import com.soknan.umeapp.screens.HomeScreen
import com.soknan.umeapp.ui.theme.MyAssignmentTheme
import androidx.navigation.compose.composable
import com.soknan.umeapp.screens.CppArraysScreen
import com.soknan.umeapp.screens.CppBooleansScreen
import com.soknan.umeapp.screens.CppBreakContinueScreen
import com.soknan.umeapp.screens.CppCommentsScreen
import com.soknan.umeapp.screens.CppDataTypesScreen
import com.soknan.umeapp.screens.CppEnumsScreen
import com.soknan.umeapp.screens.CppForLoopScreen
import com.soknan.umeapp.screens.CppGetStarted
import com.soknan.umeapp.screens.CppIfElseScreen
import com.soknan.umeapp.screens.CppMathScreen
import com.soknan.umeapp.screens.CppMemoryManagementScreen
import com.soknan.umeapp.screens.CppOperatorsScreen
import com.soknan.umeapp.screens.CppOutputScreen
import com.soknan.umeapp.screens.CppPointersScreen
import com.soknan.umeapp.screens.CppReferencesScreen
import com.soknan.umeapp.screens.CppStringsScreen
import com.soknan.umeapp.screens.CppStructuresScreen
import com.soknan.umeapp.screens.CppSwitchScreen
import com.soknan.umeapp.screens.CppSyntaxScreen
import com.soknan.umeapp.screens.CppUserInputScreen
import com.soknan.umeapp.screens.CppVariablesScreen
import com.soknan.umeapp.screens.CppWhileLoopScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()

            NavHost(
                navController = navController,
                startDestination = Screen.Home.route
            ) {

                composable(Screen.Home.route) {
                    HomeScreen(navController = navController)
                }

                composable(Screen.CppGetStarted.route) {
                    CppGetStarted(navController = navController)
                }

                composable(Screen.CppSyntax.route) {
                    CppSyntaxScreen(navController = navController)
                }

                composable(Screen.CppOutput.route) {
                    CppOutputScreen(navController = navController)
                }

                composable(Screen.CppComments.route) {
                    CppCommentsScreen(navController = navController)
                }

                composable(Screen.CppVariables.route) {
                    CppVariablesScreen(navController = navController)
                }

                composable(Screen.CppUserInput.route) {
                    CppUserInputScreen(navController = navController)
                }

                composable(Screen.CppDataTypes.route) {
                    CppDataTypesScreen(navController = navController)
                }

                composable(Screen.CppOperators.route) {
                    CppOperatorsScreen(navController = navController)
                }

                composable(Screen.CppStrings.route) {
                    CppStringsScreen(navController = navController)
                }

                composable(Screen.CppMath.route) {
                    CppMathScreen(navController = navController)
                }

                composable(Screen.CppBooleans.route) {
                    CppBooleansScreen(navController = navController)
                }

                composable(Screen.CppIfElse.route) {
                    CppIfElseScreen(navController = navController)
                }

                composable(Screen.CppSwitch.route) {
                    CppSwitchScreen(navController = navController)
                }

                composable(Screen.CppWhileLoop.route) {
                    CppWhileLoopScreen(navController = navController)
                }

                composable(Screen.CppForLoop.route) {
                    CppForLoopScreen(navController = navController)
                }

                composable(Screen.CppBreakContinue.route) {
                    CppBreakContinueScreen(navController = navController)
                }

                composable(Screen.CppArrays.route) {
                    CppArraysScreen(navController = navController)
                }

                composable(Screen.CppStructures.route) {
                    CppStructuresScreen(navController = navController)
                }

                composable(Screen.CppEnums.route) {
                    CppEnumsScreen(navController = navController)
                }

                composable(Screen.CppReferences.route) {
                    CppReferencesScreen(navController = navController)
                }

                composable(Screen.CppPointers.route) {
                    CppPointersScreen(navController = navController)
                }

                composable(Screen.CppMemoryManagement.route) {
                    CppMemoryManagementScreen(navController = navController)
                }
            }


        }
    }
}

