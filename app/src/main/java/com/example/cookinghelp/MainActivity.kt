package com.example.cookinghelp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.cookinghelp.ui.screen.welcome.WelcomeScreen
import com.example.cookinghelp.ui.theme.CookingHelpTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CookingHelpTheme {
                WelcomeScreen()
            }
        }
    }
}