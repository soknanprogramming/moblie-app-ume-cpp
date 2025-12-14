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
fun CppArraysScreen(navController: NavHostController) {
    UnitsPage("C++ Arrays", navController) {

        Text(
            text = "C++ Arrays",
            fontSize = 22.sp,
            fontFamily = FontFamily.Serif,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Arrays are used to store multiple values of the same type in a single variable. Each value has an index.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Declaring Arrays",
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
                    "int numbers[5];          // array of 5 integers\n" +
                            "string names[3];         // array of 3 strings",
                color = Color(0xFF00FFAA),
                fontSize = 14.sp,
                fontFamily = FontFamily.Monospace
            )
        }

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
                    "#include <iostream>\n" +
                            "using namespace std;\n\n" +
                            "int main() {\n" +
                            "    int numbers[5] = {1, 2, 3, 4, 5};\n" +
                            "    cout << numbers[0]; // prints 1\n" +
                            "    return 0;\n" +
                            "}",
                color = Color(0xFF00FFAA),
                fontSize = 14.sp,
                fontFamily = FontFamily.Monospace
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Arrays allow you to store and access multiple values using indices. The first element has index 0.",
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCppArraysScreen() {
    val navController = rememberNavController()
    CppArraysScreen(navController)
}
