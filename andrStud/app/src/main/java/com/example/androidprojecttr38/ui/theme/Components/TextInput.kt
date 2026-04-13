package com.example.androidprojecttr38.ui.theme.Components

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun TextInputField(
                       modifier: Modifier = Modifier) {
    OutlinedTextField(
        modifier = modifier,
        value = "",
        onValueChange = { },
        placeholder = { Text(text = "Подсказка") },
        label = { Text(text = "Текст") }
    )
}

@Preview
@Composable
private fun TextInputFieldPreview() {
    TextInputField()
}