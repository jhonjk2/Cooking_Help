package com.example.cookinghelp.ui.screen.login

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Button
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.ButtonDefaults



private val CookingOrange = Color(0xFFFF6B00)
@Composable
fun LoginScreen() {

    //Cor da tela laranja


    // E-mail
    var email by remember { mutableStateOf("") }

    // Password
    var password by remember { mutableStateOf("") }

    // Para saber se a senha está visível ou Oculta
    var passwordVisible by remember { mutableStateOf(false) }

    // Estrutura principal da tela
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {

        // Título
        Text(
            text = "Bem-Vindo de Volta!",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        // Espaço entre o título e o subtítulo
        Spacer(
            modifier = Modifier.height(8.dp)
        )

        // Subtítulo
        Text(
            text = "Entre na Sua Conta para Continuar",
            fontSize = 14.sp
        )

        // Espaço antes do campo de e-mail
        Spacer(
            modifier = Modifier.height(24.dp)
        )

        // Campo de E-mail
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = {
                Text("E-mail")
            },
            placeholder = {
                Text("Digite Seu E-mail")
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
        )

        // Espaço entre e-mail e senha
        Spacer(
            modifier = Modifier.height(16.dp)
        )

        // Campo de Senha
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = {
                Text("Senha")
            },
            placeholder = {
                Text("Digite Sua Senha")
            },

            // Esconde ou mostra a senha
            visualTransformation = if (passwordVisible) {
                VisualTransformation.None
            } else {
                PasswordVisualTransformation()
            },

            // Botão para mostrar ou esconder a senha
            trailingIcon = {
                Text(
                    text = if (passwordVisible) "🙈" else "👁️",
                    modifier = Modifier.clickable {
                        passwordVisible = !passwordVisible
                    }
                )
            },

            modifier = Modifier.fillMaxWidth()
        )

        // Espaço antes de "Esqueci minha senha"
        Spacer(
            modifier = Modifier.height(8.dp)
        )

        // Recuperar senha
        Text(
            text = "Esqueci Minha Senha",
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    // TODO
                },
            textAlign = TextAlign.End
        )

        Spacer(
            modifier = Modifier.height(24.dp)
        )
        Button(
            onClick = {
                // TODO Vou implementar o login depois
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = CookingOrange
            )
        ) {
            Text(
                text = "Entrar",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Text(
            text = "Ainda não Tem Conta? Criar Conta",
            modifier = Modifier
                .fillMaxWidth()
                .clickable{
                    //Todo Vou implementar depois o botao de criar conta
                },
            textAlign = TextAlign.Center
        )
    }
}