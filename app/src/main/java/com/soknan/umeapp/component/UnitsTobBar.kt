package com.soknan.umeapp.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.soknan.umeapp.ui.theme.Orange




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UnitsTobBar(title: String){
    TopAppBar(
        title = {
            Text(
                text = title,
                color = Color.Black
            )
        },
        navigationIcon = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Back",
                modifier = Modifier
                    .padding(8.dp)
                    .clickable() {  }
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Orange
        )
    )
}

@Preview
@Composable
fun TopBarPreview(){
    UnitsTobBar("C++ Get Started")
}