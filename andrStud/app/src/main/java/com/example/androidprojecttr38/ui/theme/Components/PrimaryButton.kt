package com.example.androidprojecttr38.ui.theme.Components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidprojecttr38.ui.theme.MainButtonInactive
import com.example.androidprojecttr38.ui.theme.MainButtonActive_pr04

@Composable
fun PrimaryButton(
    Mainbuttontext: String,
    modifier:  Modifier = Modifier,
    enabled:  Boolean = true,
    onClick: () -> Unit
) {
    Button(
        onClick  = onClick,
        modifier = Modifier
            .size( 336.dp,55.dp),
        enabled = enabled,
        colors = ButtonColors(
            containerColor = MainButtonActive_pr04,
            contentColor = Color.White,
            disabledContainerColor= MainButtonInactive,
            disabledContentColor= Color.White
        ),
        shape = RoundedCornerShape(15)
    ) {
        Text(text = Mainbuttontext)
    }
}



@Preview
@Composable
private fun PrimaryButtonPreview() {
    PrimaryButton("Кнопка", onClick = {}, enabled = true)
}


