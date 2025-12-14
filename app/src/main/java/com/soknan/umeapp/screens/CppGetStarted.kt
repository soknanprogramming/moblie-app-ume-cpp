package com.soknan.umeapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.soknan.umeapp.component.UnitsPage
import com.soknan.umeapp.component.UnitsTobBar

//@Preview
@Composable
fun CppGetStarted(navController : NavHostController){
    UnitsPage ("C++ Get Started", navController) {
        // code here
        // Title
        Text(
            text = "What is C++?",
            fontSize = 22.sp,
            fontFamily = FontFamily.Serif,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "C++ is a powerful programming language used to build software, games, operating systems, and high-performance applications.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

// Section
        Text(
            text = "Why Learn C++?",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "• Very fast and efficient\n" +
                    "• Used in game development\n" +
                    "• Used in system programming\n" +
                    "• Foundation for many other languages",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

// Code box
        Text(
            text = "Your First C++ Program",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF1E1E1E))
                .padding(12.dp)
        ) {
            Text(
                text =
                    "#include <iostream>\n\n" +
                            "int main() {\n" +
                            "    std::cout << \"Hello, World!\";\n" +
                            "    return 0;\n" +
                            "}",
                color = Color(0xFF00FFAA),
                fontSize = 14.sp,
                fontFamily = FontFamily.Monospace
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "This program prints 'Hello, World!' to the screen. It is usually the first program you write when learning C++.",
            fontSize = 16.sp
        )

    }

}

@Preview(showBackground = true)
@Composable
fun PreviewCppGetStarted() {
    val navController = rememberNavController()
    CppGetStarted(navController)
}