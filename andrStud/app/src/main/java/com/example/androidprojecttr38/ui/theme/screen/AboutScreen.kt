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
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidprojecttr38.R


@Composable
fun AboutScr(modifier: Modifier = Modifier,
             TextButtonNext: String,
             HeadText: String,
             AboutText: String,
             PlusImage: Int,
             StepImage: Int,
             IllustrationImage: Int,) {
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
                Text(text = TextButtonNext)
            }

            Image(
                painter = painterResource(id = PlusImage),
                contentDescription = "ButtonPlus",
                modifier = Modifier
            )
        }


        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier
                .height(273.dp))
            Text(
                text = HeadText,
                modifier = Modifier,
                color = Color.Green
            )
            Spacer(modifier = Modifier
                .height(29.dp))
            Text(
                text = AboutText,
                modifier = Modifier,
                color = Color.Gray
            )
        }

        Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier
                .height(406.dp))
            Image(
                painter = painterResource(id = StepImage),
                contentDescription = "",
                modifier = Modifier
            )
            Spacer(modifier = Modifier
                .height(105.dp))
            Image(
                painter = painterResource(id = IllustrationImage),
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
    AboutScr(modifier = Modifier, TextButtonNext = "Далее", HeadText = "Анализы", AboutText = "Эксперсс сбор и получение проб", PlusImage = R.drawable.plus, StepImage = R.drawable.first1, IllustrationImage = R.drawable.illustration)
//  AboutScr(modifier = Modifier, TextButtonNext = "Далее", HeadText = "Уведомления", AboutText = "Вы быстро узнаете о результатах", PlusImage = R.drawable.plus, StepImage = R.drawable.group_2__1_, IllustrationImage = R.drawable.doc1)
//AboutScr(modifier = Modifier, TextButtonNext = "Далее", HeadText = "Мониторинг", AboutText = "Наши врачи наблюдают за вашими показателями здоровья", PlusImage = R.drawable.plus, StepImage = R.drawable.first1, IllustrationImage = R.drawable.doc2)
}