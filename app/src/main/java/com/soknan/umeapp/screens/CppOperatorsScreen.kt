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
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavHostController
import com.soknan.umeapp.component.UnitsPage

@Composable
fun CppOperatorsScreen(navController: NavHostController) {
    UnitsPage("C++ Operators", navController) {

        Text(
            text = "C++ Operators",
            fontSize = 22.sp,
            fontFamily = FontFamily.Serif,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Operators are symbols that perform operations on variables and values.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Arithmetic Operators",
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text =
                "• +  Addition\n" +
                        "• -  Subtraction\n" +
                        "• *  Multiplication\n" +
                        "• /  Division\n" +
                        "• %  Modulus",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Example Usage",
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
                    "int a = 10;\n" +
                            "int b = 5;\n" +
                            "int sum = a + b;\n" +
                            "int product = a * b;\n" +
                            "cout << sum << \" \" << product;",
                color = Color(0xFF00FFAA),
                fontSize = 14.sp,
                fontFamily = FontFamily.Monospace
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "C++ also has comparison operators (==, !=, >, <) and logical operators (&&, ||, !). Operators allow you to perform calculations, comparisons, and logical operations.",
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCppOperatorsScreen() {
    val navController = rememberNavController()
    CppOperatorsScreen(navController)
}
