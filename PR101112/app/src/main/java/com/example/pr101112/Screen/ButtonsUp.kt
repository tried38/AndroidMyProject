package com.example.pr101112.Screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Categories(
    modifier: Modifier = Modifier,
    onClickBtn: () -> Unit,
    textBtn: String,
    widthBtn: Int,
    heightBtn: Int
) {
    Button(
        onClick = onClickBtn,
        modifier = Modifier
            .width(widthBtn.dp)
            .height(heightBtn.dp)
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(10.dp)
            ),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.White,
            contentColor = Color.Gray
        ),
        shape = RoundedCornerShape(10.dp),
        contentPadding = PaddingValues(0.dp),
    ) {
        Text(
            text = textBtn,
            fontSize = 15.sp,
            letterSpacing = 0.sp,
            lineHeight = 20.sp
        )
    }
}

@Preview
@Composable
private fun CategoriesPrev() {
    Categories(
        onClickBtn = {},
        textBtn = "Популярные",
        widthBtn = 131,
        heightBtn = 48
    )
}