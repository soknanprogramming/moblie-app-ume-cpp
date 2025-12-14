package com.soknan.umeapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
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


@Preview(showBackground = true)
@Composable
fun PreviewCppSyntaxScreen() {
    val navController = rememberNavController()
    CppSyntaxScreen(navController)
}

@Composable
fun CppSyntaxScreen(navController : NavHostController){
    UnitsPage ("C++ Syntax", navController) {
        Text(
            text = "C++ Program Structure",
            fontSize = 22.sp,
            fontFamily = FontFamily.Serif,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "A C++ program is made up of statements and functions. Each statement tells the computer what to do.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Basic Syntax Rules",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text =
                "• C++ is case-sensitive\n" +
                        "• Every statement ends with a semicolon (;)\n" +
                        "• Code blocks use curly braces { }\n" +
                        "• The main() function is required",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Example Syntax",
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
                            "using namespace std;\n\n" +
                            "int main() {\n" +
                            "    cout << \"Hello C++\";\n" +
                            "    return 0;\n" +
                            "}",
                color = Color(0xFF00FFAA),
                fontSize = 14.sp,
                fontFamily = FontFamily.Monospace
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "This example shows the basic structure of a C++ program, including the header, main function, and output statement.",
            fontSize = 16.sp
        )

    }
}