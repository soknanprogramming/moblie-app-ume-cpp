package com.soknan.umeapp.screens
import com.soknan.umeapp.R


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.soknan.umeapp.NavItem
import com.soknan.umeapp.ui.theme.Orange

val navItems = listOf(
    NavItem("C++ Get Started", "cpp_get_started"),
    NavItem("C++ Syntax", "cpp_syntax"),
    NavItem("C++ Output", "cpp_output"),
    NavItem("C++ Comments", "cpp_comments"),
    NavItem("C++ Variables", "cpp_variables"),
    NavItem("C++ User Input", "cpp_user_input"),
    NavItem("C++ Data Types", "cpp_data_types"),
    NavItem("C++ Operators", "cpp_operators"),
    NavItem("C++ Strings", "cpp_strings"),
    NavItem("C++ Math", "cpp_math"),
    NavItem("C++ Booleans", "cpp_booleans"),
    NavItem("C++ If...Else", "cpp_if_else"),
    NavItem("C++ Switch", "cpp_switch"),
    NavItem("C++ While Loop", "cpp_while_loop"),
    NavItem("C++ For Loop", "cpp_for_loop"),
    NavItem("C++ Break/Continue", "cpp_break_continue"),
    NavItem("C++ Arrays", "cpp_arrays"),
    NavItem("C++ Structures", "cpp_structures"),
    NavItem("C++ Enums", "cpp_enums"),
    NavItem("C++ References", "cpp_references"),
    NavItem("C++ Pointers", "cpp_pointers"),
    NavItem("C++ Memory Management", "cpp_memory_management")
)




@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun HomeScreen(){
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
                        Image(
                            painter = painterResource(id = R.drawable.ume),
                            contentDescription = "Logo",
                            modifier = Modifier
                                .padding(5.dp)
                                .size(48.dp) // adjust size
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
                TapUnit(unitName = navItem.title, onPress = {})
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
