package com.example.androidprojecttr38.ui.theme.screen

import android.widget.Button
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprojecttr38.ui.theme.MainButtonActive_pr05


@Composable
fun SignUp(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .background(color = Color.White),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .width(335.dp)
                .height(91.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(
                modifier = Modifier
                    .height(59.dp)
            )
            Text(
                text = "Добро пожаловать!",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 28.sp
            )
            Spacer(
                modifier = Modifier
                    .height(24.dp)
            )
            Text(
                modifier = modifier
                    .align(Alignment.Start),
                text = "Войдите чтобы пользоваться функциями приложения",
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .width(335.dp)
                .height(91.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(
                modifier = Modifier
                    .height(262.dp)
            )
            Text(
                modifier = modifier
                    .height(14.dp)
                    .align(Alignment.Start),
                text = "Вход по E-mail",
                color = Color.Gray
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = { Text("user@example.com") },
                modifier = Modifier
                    .width(340.dp)
                    .height(58.dp),
                shape = RoundedCornerShape(12.dp),
                singleLine = true,
                enabled = true
            )

            Spacer(modifier = Modifier.height(24.dp))

            OutlinedButton(
                onClick  = {},
                enabled = false,
                modifier = modifier
                    .width(340.dp)
                    .height(54.dp),
                colors = ButtonColors(
                    containerColor = MainButtonActive_pr05,
                    contentColor = Color.White,
                    disabledContainerColor= MainButtonActive_pr05,
                    disabledContentColor= Color.White
                ),
                border = BorderStroke(1.dp, MainButtonActive_pr05),
                shape = RoundedCornerShape(15)

            ) {
                Text(

                    text = "Далее",
                    color = Color.White
                )
            }
        }

        Column(
            modifier = modifier
                .width(335.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(
                modifier.height(660.dp)
            )

            Text(
                text = "Или войдите с помощью",
                fontSize = 15.sp,
                color = Color.Gray
            )

            Spacer(
                modifier.height(16.dp)
            )

            OutlinedButton(
                onClick = { },
                modifier = Modifier
                    .width(340.dp)
                    .height(60.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = Color.White,
                    contentColor = MainButtonActive_pr05
                ),
                border = BorderStroke(1.5.dp, MainButtonActive_pr05)
            ) {
                Text(
                    text = "Войти с Яндекс",
                    fontSize = 15.sp,
                )
            }
        }
    }
}


@Preview
@Composable
private fun SignUpPreview() {
    SignUp()
}