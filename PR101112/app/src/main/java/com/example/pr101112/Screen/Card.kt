package com.example.pr101112.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pr101112.domain.TestsItem
import com.example.pr101112.ui.theme.ButtonColor
import com.example.pr101112.ui.theme.cardColor





@Composable
fun TestCard(item: TestsItem) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = cardColor)
            .padding(16.dp)
    ) {

        Column(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(end = 120.dp)
        ) {
            Text(
                text = item.name,
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black,
                lineHeight = 20.sp
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "${item.days} ${if (item.days == 1) "день" else "дня"}",
                fontSize = 13.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "${item.price} ₽",
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }

        // Кнопка — справа внизу
        Button(
            onClick = { },
            modifier = Modifier.align(Alignment.BottomEnd),
            shape = RoundedCornerShape(8.dp),
            colors = ButtonDefaults.buttonColors(containerColor = ButtonColor),
            contentPadding = PaddingValues(horizontal = 20.dp, vertical = 10.dp)
        ) {
            Text(
                text = "Добавить",
                fontSize = 14.sp,
                color = Color.White
            )
        }
    }
}
