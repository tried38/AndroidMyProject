package com.example.androidprojecttr38.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidprojecttr38.R
import com.example.androidprojecttr38.ui.theme.ButtonBackColor

@Composable
fun OrderPlacing(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .background(color = Color.White),
        contentAlignment = Alignment.Center) {
        Spacer(modifier = Modifier
            .height(60.dp))
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)) {

            OutlinedButton(onClick = {},
                enabled = true,
                modifier = Modifier.size(32.dp),
                shape = RoundedCornerShape(8.dp),
                contentPadding = PaddingValues(0.dp),
                colors = ButtonDefaults.textButtonColors(ButtonBackColor)
            ) {
                Image(painter = painterResource(id = R.drawable.icons),
                    contentDescription = "ButtonBack",
                    modifier = Modifier.fillMaxSize())
            }

            Spacer(modifier = Modifier.height(56.dp))
            Text(   text = "Оформление заказа",
                    modifier = Modifier,
                    color = Color.Black,
                    fontSize = 24.sp)
            Spacer(modifier = Modifier.height(32.dp))

            var address by remember { mutableStateOf("") }
            Text(text = "Адрес *", color = Color.Gray)
            OutlinedTextField(
                value = address,
                onValueChange = { address = it },
                label = {Text("Введите ваш адрес")},
                placeholder = {
                    Text("Введите ваш адрес")
                },
                modifier = Modifier
                    .width(340.dp)
                    .height(58.dp),
                shape = RoundedCornerShape(12.dp),
                singleLine = true,
                enabled = true
            )
            Spacer(modifier = Modifier.height(12.dp))
            var telephone by remember { mutableStateOf("") }
            Text(text = "Телефон *", color = Color.Gray)
            OutlinedTextField(
                value = telephone,
                onValueChange = { telephone = it },
                label = { Text("Введите ваш номер телефона")},
                placeholder = {
                    Text("Введите ваш номер телефона")
                },
                modifier = Modifier
                    .width(340.dp)
                    .height(58.dp),
                shape = RoundedCornerShape(12.dp),
                singleLine = true,
                enabled = true
            )


            Spacer(modifier = Modifier.height(12.dp))
            Text(text = "Коментарий", color = Color.Gray)
            var coment by remember { mutableStateOf("") }

            OutlinedTextField(
                value = coment,
                onValueChange = { coment = it },
                label = { Text(text = "Можете оставить свои пожелания", color = Color.Gray) },
                placeholder = {
                    Text("Можете оставить свои пожелания")
                },
                modifier = Modifier
                    .width(335.dp)
                    .height(152.dp),
                shape = RoundedCornerShape(12.dp),
                singleLine = false,
                enabled = true
            )
        }
    }
}

@Preview
@Composable
private fun OrderPlacingPrev() {
    OrderPlacing()
}