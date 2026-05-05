package com.example.pr4.ui.theme.Components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pr101112.ui.theme.ButtonColor
import com.example.pr101112.ui.theme.ButtonColorText
import com.example.pr101112.ui.theme.DisabledButtonColor

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    buttontext: String,
    onClick: () -> Unit,
    enabled: Boolean = true
                  ) {
    Button(
        onClick = onClick,
        enabled = enabled,
        shape = RoundedCornerShape(10.dp),
        colors = ButtonColors(
            containerColor = ButtonColor,
            contentColor = ButtonColorText,
            disabledContentColor = ButtonColorText,
            disabledContainerColor = DisabledButtonColor
        )
    ) {
        Text(
            text = buttontext
        )
    }
}

@Preview
@Composable
private fun PrimaryButtonPreview() {
    PrimaryButton(buttontext = "Кнопка", onClick = {}, enabled = true)
}