package com.example.androidprojecttr38.ui.theme.Components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidprojecttr38.ui.theme.MainButtonActive_pr04

@Composable
fun SecondaryButton(
    SecondButton: String,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    OutlinedButton(
        onClick  = onClick,
        modifier = Modifier.fillMaxWidth()
            .size(width = 335.dp, height = 56.dp),
        enabled = enabled,
        colors = ButtonColors(
            containerColor = Color.White,
            contentColor = MainButtonActive_pr04,
            disabledContainerColor= Color.White,
            disabledContentColor= MainButtonActive_pr04
        ),
        border = BorderStroke(1.dp, MainButtonActive_pr04),
        shape = RoundedCornerShape(15)

    ) {
        Text(
            text = SecondButton,
            color = MainButtonActive_pr04
        )
    }
}
@Preview
@Composable
private fun SecondaryButtonPreview() {
    SecondaryButton("Кнопка1", onClick = {}, enabled = true, modifier = Modifier)
}