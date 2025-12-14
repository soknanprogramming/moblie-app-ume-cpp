package com.soknan.umeapp.screens
import android.content.Intent
import android.net.Uri
import com.soknan.umeapp.R


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.soknan.umeapp.datas.NavItem
import com.soknan.umeapp.ui.theme.Orange
import androidx.core.net.toUri

val navItems = listOf(
    NavItem("C++ Get Started", Screen.CppGetStarted.route),
    NavItem("C++ Syntax", Screen.CppSyntax.route),
    NavItem("C++ Output", Screen.CppOutput.route),
    NavItem("C++ Comments", Screen.CppComments.route),
    NavItem("C++ Variables", Screen.CppVariables.route),
    NavItem("C++ User Input", Screen.CppUserInput.route),
    NavItem("C++ Data Types", Screen.CppDataTypes.route),
    NavItem("C++ Operators", Screen.CppOperators.route),
    NavItem("C++ Strings", Screen.CppStrings.route),
    NavItem("C++ Math", Screen.CppMath.route),
    NavItem("C++ Booleans", Screen.CppBooleans.route),
    NavItem("C++ If...Else", Screen.CppIfElse.route),
    NavItem("C++ Switch", Screen.CppSwitch.route),
    NavItem("C++ While Loop", Screen.CppWhileLoop.route),
    NavItem("C++ For Loop", Screen.CppForLoop.route),
    NavItem("C++ Break/Continue", Screen.CppBreakContinue.route),
    NavItem("C++ Arrays", Screen.CppArrays.route),
    NavItem("C++ Structures", Screen.CppStructures.route),
    NavItem("C++ Enums", Screen.CppEnums.route),
    NavItem("C++ References", Screen.CppReferences.route),
    NavItem("C++ Pointers", Screen.CppPointers.route),
    NavItem("C++ Memory Management", Screen.CppMemoryManagement.route)
)



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController :NavHostController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Learning C++ for free",
                        color = Color.Black)
                },
                navigationIcon = {
                    Row {
                        val context = LocalContext.current
                        Image(
                            painter = painterResource(id = R.drawable.ume),
                            contentDescription = "Logo",
                            modifier = Modifier
                                .padding(5.dp)
                                .size(48.dp)
                                .clickable {
                                    val intent = Intent(Intent.ACTION_VIEW, "http://www.umekratie.edu.kh/".toUri())
                                    context.startActivity(intent)
                                }
                        )
                        Image(
                            painter = painterResource(id = R.drawable.cpp),
                            contentDescription = "Logo",
                            modifier = Modifier
                                .padding(5.dp)
                                .size(48.dp) // adjust size
                        )

                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Orange
                )

            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(navItems) { navItem ->
                TapUnit(unitName = navItem.title, onPress = { navController.navigate(navItem.route) })
            }
            item {
                Spacer(modifier = Modifier.height(8.dp))
            }
        }


    }
}

@Composable
fun TapUnit(unitName: String, onPress: () -> Unit) {
    Spacer(modifier = Modifier.height(8.dp))
    Box(
        modifier = Modifier
            .fillMaxWidth(0.95f)                     // take full width of Column
            .height(40.dp)
            .clip(RoundedCornerShape(6.dp))
            .background(Color.Yellow)
            .clickable { onPress() }
            .border(color = Color.Red, width = 1.dp, shape = RoundedCornerShape(6.dp)),
        contentAlignment = Alignment.CenterStart,

    ) {
        Text(
            text = unitName,
            color = Color.Black,
            modifier = Modifier.padding(start = 15.dp),
            fontSize = 20.sp

        )
    }
}

@Preview(showBackground = false)
@Composable
fun PreviewHomeScreen() {
    val navController = rememberNavController()
    HomeScreen(navController)
}
