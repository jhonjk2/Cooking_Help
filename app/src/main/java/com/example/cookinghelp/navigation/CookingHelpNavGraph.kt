package com.example.cookinghelp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cookinghelp.ui.screen.login.LoginScreen
import com.example.cookinghelp.ui.screen.welcome.WelcomeScreen

@Composable
fun CookingHelpNavGraph() {

    // Cria o controlador responsável pela navegação
    val navController = rememberNavController()

    // Define as telas da aplicação
    NavHost(
        navController = navController,

        // Primeira tela que será aberta
        startDestination = "welcome"
    ) {

        // -------------------------
        // TELA DE WELCOME
        // -------------------------
        composable("welcome") {

            WelcomeScreen(

                // Botão "Começar agora"
                onStartClick = {
                    navController.navigate("login")
                },

                // "Já tenho uma conta — Entrar"
                onLoginClick = {
                    navController.navigate("login")
                }
            )
        }

        // -------------------------
        // TELA DE LOGIN
        // -------------------------
        composable("login") {

            LoginScreen()
        }
    }
}
