package com.soknan.umeapp.datas

sealed class Screen(val route: String){
    object Home: Screen("home")
    object CppGetStarted: Screen("cpp_get_started")
}