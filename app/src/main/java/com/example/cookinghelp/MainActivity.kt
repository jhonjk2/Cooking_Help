package com.example.cookinghelp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cookinghelp.ui.theme.CookingHelpTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CookingHelpTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(

                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
    fun Greeting(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(50.dp)
    ){




        Text(
            text = "Cooking Help"
        )
        Text(
            text = "O que vamos cozinhar Hoje ?"
        )
        Text(
            text = "Encontre receitas com o que você tem em casa."
        )
        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ){
            Text(
                text ="Frango"
            )

            Text(
                text ="Arroz"
            )

            Text(
                text ="Batata"
            )

        }
        Button(
            onClick = {

            }
        ) {
            Text("Encontrar Receitas")
        }
    }
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CookingHelpTheme {
        Greeting()
    }
}