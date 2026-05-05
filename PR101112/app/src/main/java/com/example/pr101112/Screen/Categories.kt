package com.example.pr101112.Screen

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pr101112.ui.theme.ButtonColor
import com.example.pr101112.ui.theme.cardColor


@Composable
fun CategoriesButton(    title: String,
                   isSelected: Boolean,
                   onClick: () -> Unit) {
    OutlinedButton(
        onClick = onClick,
        shape = RoundedCornerShape(10.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = cardColor,
            contentColor = Color.Gray
    ),
    ) {
        Text(
            text = title,
            fontSize = 14.sp
        )
    }
}
