package com.example.androidprojecttr38.ui.theme.screen

import android.util.Log
import android.widget.Button
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprojecttr38.ui.theme.MainButtonActive_pr05
import  androidx.compose.runtime.getValue
import  androidx.compose.runtime.setValue

@Composable
fun SignUp(
    modifier: Modifier = Modifier,
    welcomeText: String,
    descriptionText: String,
    emailLabelText: String,
    emailPlaceholderText: String,
    nextButtonText: String,
    orText: String,
    yandexButtonText: String
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // === ВЕРХНЯЯ ЧАСТЬ ===
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(59.dp))

            Text(
                text = welcomeText,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 28.sp,
                modifier = Modifier
            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = descriptionText,
                modifier = Modifier.fillMaxWidth()
            )
        }

        // === СРЕДНЯЯ ЧАСТЬ ===
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(100.dp))

            Text(
                text = emailLabelText,
                color = Color.Gray,
                modifier = Modifier.fillMaxWidth()
            )

//            Spacer(modifier = Modifier.height(8.dp))

            var email by remember { mutableStateOf("") }
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text(emailPlaceholderText) },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                singleLine = true,
                enabled = true
            )

            Spacer(modifier = Modifier.height(24.dp))

            OutlinedButton(
                onClick = {
                    Log.d("SignUp", email)
                },
                enabled = true,
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonColors(
                    containerColor = MainButtonActive_pr05,
                    contentColor = Color.White,
                    disabledContainerColor = MainButtonActive_pr05,
                    disabledContentColor = Color.White
                ),
                border = BorderStroke(1.dp, MainButtonActive_pr05),
                shape = RoundedCornerShape(15)
            ) {
                Text(
                    text = nextButtonText,
                    color = Color.White
                )
            }
        }

        // === ОТСТУП МЕЖДУ СРЕДНЕЙ И НИЖНЕЙ ЧАСТЬЮ ===
        Spacer(modifier = Modifier.height(274.dp))

        // === НИЖНЯЯ ЧАСТЬ ===
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = orText,
                fontSize = 15.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedButton(
                onClick = { },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.White,
                    contentColor = MainButtonActive_pr05
                ),
                border = BorderStroke(1.5.dp, MainButtonActive_pr05)
            ) {
                Text(
                    text = yandexButtonText,
                    fontSize = 15.sp,
                )
            }
        }
    }
}

@Preview
@Composable
private fun SignUpPreview() {
    SignUp(
        welcomeText = "Добро пожаловать!",
        descriptionText = "Войдите, чтобы пользоваться функциями приложения",
        emailLabelText = "Вход по E-mail",
        emailPlaceholderText = "example@mail.ru",
        nextButtonText = "Далее",
        orText = "Или войдите с помощью",
        yandexButtonText = "Войти с Яндекс"
    )
}