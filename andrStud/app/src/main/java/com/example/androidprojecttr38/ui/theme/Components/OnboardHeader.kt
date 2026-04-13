package com.example.androidprojecttr38.ui.theme.Components

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidprojecttr38.ui.theme.AccentColor

@Composable
fun OnboardHeader(text: String, modifier: Modifier = Modifier, color: Color = AccentColor
) {
    Text(
        text = "Заголовок",
        modifier = modifier
    )
}

@Composable
fun OnboardDescription(text: String,modifier: Modifier = Modifier) {
    Text(
        text = "Описание",
        modifier = modifier
    )
}

@Composable
fun TextButtonClick(onClick: () -> Unit, text: String,  modifier: Modifier = Modifier) {
TextButton( onClick = {},
    colors = ButtonDefaults.textButtonColors()) {
    Text( text = "Текст, на который можно нажать")
}
}

@Preview(showBackground = true)
@Composable
private fun OnboardHeaderPreview() {
    OnboardHeader("Hello")
}

@Preview
@Composable
private fun OnboardDescriptionPreview() {
    OnboardDescription("")
}

@Preview
@Composable
private fun TextButtonPreview() {
    TextButtonClick(text = "Текст, на который можно нажать", onClick = {})
}