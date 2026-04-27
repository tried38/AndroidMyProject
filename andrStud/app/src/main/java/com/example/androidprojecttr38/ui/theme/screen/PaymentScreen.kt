package com.example.androidprojecttr38.ui.theme.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PaymentScreen(  modifier: Modifier = Modifier,
                    PaymentText:String,
                    SomeImage: Int,
                    FirstText:String,
                    SecondText:String,
                    ThirdText:String,
                    PaymentTextButton: String,
                    OnMainPage: String) {
    Column(modifier = modifier
        .background(color = Color.White)
        .padding(start = 16.dp, end = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = PaymentText,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 28.sp,
            modifier = Modifier
        )

        Text(
            text = FirstText,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 28.sp,
            modifier = Modifier
        )

        Text(
            text = SecondText,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 28.sp,
            modifier = Modifier
        )

        Text(
            text = ThirdText,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 28.sp,
            modifier = Modifier
        )
    }

}

@Preview
@Composable
private fun PaymentScreenPrev() {
    PaymentScreen(
        PaymentText = "hello",
        SomeImage = 1,
        FirstText = "123",
        SecondText = "123",
        ThirdText = "qweqw",
        PaymentTextButton = "check",
        OnMainPage = "Back"
    )
}