package com.example.cookinghelp.ui.screen.welcome

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val CookingOrange = Color(0xFFFF6B00)

@Composable
fun WelcomeScreen(
    onStartClick: () -> Unit = {},
    onLoginClick: () -> Unit = {}
) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(CookingOrange)
    ) {

        // Círculo decorativo no canto superior direito
        Box(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(
                    top = 20.dp,
                    end = 20.dp
                )
                .height(100.dp)
                .fillMaxWidth(0.45f)
                .alpha(0.08f)
                .background(
                    color = Color.White,
                    shape = CircleShape
                )
        )

        // Conteúdo principal da tela
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                    top = 80.dp,
                    bottom = 30.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            // Ícone do Cooking Help
            Box(
                modifier = Modifier
                    .height(70.dp)
                    .fillMaxWidth(0.30f)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(18.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "\uD83E\uDDD1\u200D\uD83C\uDF73",
                    fontSize = 32.sp
                )
            }

            Spacer(
                modifier = Modifier.height(24.dp)
            )

            // Nome do aplicativo
            Text(
                text = "Cooking\nHelp",
                color = Color.White,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            // Descrição
            Text(
                text = "Descubra receitas incríveis, compartilhe suas\n" +
                        "criações e aprenda sua habilidade na cozinha",
                color = Color.White,
                fontSize = 13.sp,
                textAlign = TextAlign.Center
            )

            Spacer(
                modifier = Modifier.height(24.dp)
            )

            // Benefícios do aplicativo
            BenefitItem(
                icon = "▣",
                text = "Milhares de receitas"
            )

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            BenefitItem(
                icon = "♟",
                text = "Comunidade de Chefs Amadores"
            )

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            BenefitItem(
                icon = "☆",
                text = "Receitas avaliadas"
            )

            Spacer(
                modifier = Modifier.height(28.dp)
            )

            // Botão principal
            Button(
                onClick = onStartClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = CookingOrange
                )
            ) {
                Text(
                    text = "Começar agora",
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            // Área para usuários que já possuem conta
            Row(
                modifier = Modifier
                    .clickable {
                        onLoginClick()
                    }
                    .padding(
                        horizontal = 12.dp,
                        vertical = 8.dp
                    ),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "Já tenho uma conta",
                    color = Color.White,
                    fontSize = 12.sp
                )

                Text(
                    text = "  —  ",
                    color = Color.White,
                    fontSize = 12.sp
                )

                Text(
                    text = "Entrar",
                    color = Color.White,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Composable
private fun BenefitItem(
    icon: String,
    text: String
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color.White.copy(alpha = 0.12f),
                shape = RoundedCornerShape(20.dp)
            )
            .padding(
                horizontal = 16.dp,
                vertical = 10.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = icon,
            color = Color.White,
            fontSize = 16.sp
        )

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        )

        Text(
            text = text,
            color = Color.White,
            fontSize = 12.sp
        )

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        )
    }
}
