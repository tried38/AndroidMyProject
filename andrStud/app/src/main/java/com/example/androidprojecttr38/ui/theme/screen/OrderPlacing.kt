package com.example.androidprojecttr38.ui.theme.screen

import android.R.attr.fontWeight
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.androidprojecttr38.R
import com.example.androidprojecttr38.ui.theme.ButtonBackColor
import com.example.androidprojecttr38.ui.theme.MainButtonActive_pr05
import kotlin.String

@Composable
fun OrderPlacing(modifier: Modifier = Modifier,
                 navController: androidx.navigation.NavHostController,
OrderText: String,
AdressText: String,
PhoneText: String,
PromocodeText: String,
ComentText: String,
CountAnaliz: String,
CostAll: String,
buttnTXT: String
) {
    Box(modifier = Modifier
        .background(color = Color.White),
        contentAlignment = Alignment.Center) {

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(start = 20.dp, top = 60.dp, end = 26.dp, bottom = 32.dp)) {

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
            Text(   text = OrderText,
                    modifier = Modifier,
                    color = Color.Black,
                    fontSize = 24.sp)
            Spacer(modifier = Modifier.height(32.dp))

            var address by remember { mutableStateOf("") }
            Text(text = "Адрес *", color = Color.Gray)
            OutlinedTextField(
                value = address,
                onValueChange = { address = it },
                label = {Text(text = AdressText)},
                placeholder = {
                    Text("Введите ваш адрес")
                },
                modifier = Modifier
                    .fillMaxWidth()
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
                label = { Text(text = PhoneText)},
                placeholder = {
                    Text("Введите ваш номер телефона")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(58.dp),
                shape = RoundedCornerShape(12.dp),
                singleLine = true,
                enabled = true
            )


            Spacer(modifier = Modifier.height(12.dp))
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) { Text(text = "Коментарий", color = Color.Gray)
                Image(
                    painter = painterResource(id = R.drawable.voice),
                    contentDescription = "voice",
                    Modifier.size(width = 24.dp, height = 20.dp)
                )}
            var coment by remember { mutableStateOf("") }

            OutlinedTextField(
                value = coment,
                onValueChange = { coment = it },
                label = { Text(text = ComentText, color = Color.Gray) },
                placeholder = {
                    Text("Можете оставить свои пожелания")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(152.dp),
                shape = RoundedCornerShape(12.dp),
                singleLine = false,
                enabled = true
            )
            Spacer(Modifier.weight(1f))
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) { Text(text = PromocodeText, color = Color.Gray)
                Image(
                    painter = painterResource(id = R.drawable.next),
                    contentDescription = "voice",
                    Modifier.size(width = 24.dp, height = 20.dp)
                )}
            Spacer(Modifier.height(12.dp))
            Divider()
            Spacer(Modifier.height(12.dp))
            Row(
                modifier = modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) { Text(modifier = modifier, fontWeight = FontWeight(500),fontSize = 17.sp, text = CountAnaliz, color = Color.Black)
                Text(modifier = modifier, fontWeight = FontWeight(500),fontSize = 17.sp,text = CostAll, color = Color.Black)}

            Spacer(Modifier.height(12.dp))
            Button(
               onClick = { navController.navigate(paymentScreen) },
                enabled = telephone.isNotEmpty() and address.isNotEmpty(),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MainButtonActive_pr05,
                    contentColor = Color.White,
                    disabledContainerColor = MainButtonActive_pr05,
                    disabledContentColor = Color.White
                )
            ) {
                Text(
                    text = buttnTXT,
                    fontSize = 17.sp,
                    fontWeight = FontWeight(600)
                )
            }

        }
    }
}

@Preview
@Composable
private fun OrderPlacingPrev() {
    val navController = rememberNavController()
    OrderPlacing(
        modifier = Modifier,
        OrderText = "Оформление заказа",
        AdressText =  "Введите ваш адрес",
        PhoneText =  "Введите ваш номер телефона",
        PromocodeText =  "Промокод",
        ComentText =  "Можете оставить свои пожелания",
        CountAnaliz =  "1 анализ",
        CostAll =  "690 рублей",
        buttnTXT =  "Заказать",
        navController = navController
    )
}