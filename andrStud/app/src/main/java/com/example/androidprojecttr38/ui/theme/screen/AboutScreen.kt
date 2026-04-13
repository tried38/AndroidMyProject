package com.example.androidprojecttr38.ui.theme.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidprojecttr38.R


@Composable
fun AboutScr(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .background(color = Color.White),
        contentAlignment = Alignment.TopCenter
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            TextButton(
                onClick = {},
                colors = ButtonColors(
                    containerColor = Color.White,
                    contentColor = Color.Blue,
                    disabledContainerColor = Color.White,
                    disabledContentColor = Color.Blue
                )
            ) {
                Text(text = "Далее")
            }

            Image(
                painter = painterResource(id = R.drawable.plus),
                contentDescription = "ButtonPlus",
                modifier = Modifier
            )
        }


        Column(
            modifier = Modifier
                .fillMaxSize()
                .width(375.dp)
                .height(91.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier
                .height(273.dp))
            Text(
                text = "Анализы",
                modifier = Modifier,
                color = Color.Green
            )
            Spacer(modifier = Modifier
                .height(29.dp))
            Text(
                text = "Экспресс сбор и получение проб",
                modifier = Modifier,
                color = Color.Gray
            )
            Spacer(modifier = Modifier
                .height(60.dp))
            Image(
                painter = painterResource(id = R.drawable.first1),
                contentDescription = "",
                modifier = Modifier
            )
            Spacer(modifier = Modifier
                .height(105.dp))
            Image(
                painter = painterResource(id = R.drawable.illustration),
                contentDescription = "",
                modifier = Modifier
                        //.size(width = 366.dp, height = 217.dp) //doc 1
                        //.size(width = 359.dp, height = 269.dp) //doc 2
            )
        }
    }
}

@Preview
@Composable
private fun AboutScrPrev() {
    AboutScr()
}