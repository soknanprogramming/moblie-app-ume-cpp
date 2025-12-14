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

@Composable
fun CppMemoryManagementScreen(navController: NavHostController) {
    UnitsPage("C++ Memory Management", navController) {

        Text(
            text = "C++ Memory Management",
            fontSize = 22.sp,
            fontFamily = FontFamily.Serif,
            color = MaterialTheme.colorScheme.primary
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "C++ allows dynamic memory allocation using `new` and `delete`. This gives you control over memory usage, but requires careful management to avoid leaks.",
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Allocating Memory",
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
                text = "int* ptr = new int;          // allocate memory for a single integer\n" +
                        "int* arr = new int[5];       // allocate memory for an array of 5 integers",
                color = Color(0xFF00FFAA),
                fontSize = 14.sp,
                fontFamily = FontFamily.Monospace
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Freeing Memory",
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
                text = "delete ptr;           // free single integer\n" +
                        "delete[] arr;         // free array of integers",
                color = Color(0xFF00FFAA),
                fontSize = 14.sp,
                fontFamily = FontFamily.Monospace
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Example Program",
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
                    """
                    #include <iostream>
                    using namespace std;

                    int main() {
                        int* ptr = new int(42);       // allocate memory and assign 42
                        cout << *ptr << endl;

                        int* arr = new int[3]{1, 2, 3};
                        for(int i = 0; i < 3; i++)
                            cout << arr[i] << " ";
                        cout << endl;

                        delete ptr;                   // free memory
                        delete[] arr;                 // free array memory

                        return 0;
                    }
                    """.trimIndent(),
                color = Color(0xFF00FFAA),
                fontSize = 14.sp,
                fontFamily = FontFamily.Monospace
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Dynamic memory management gives flexibility but requires careful use of `new` and `delete` to avoid memory leaks.",
            fontSize = 16.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCppMemoryManagementScreen() {
    val navController = rememberNavController()
    CppMemoryManagementScreen(navController)
}
