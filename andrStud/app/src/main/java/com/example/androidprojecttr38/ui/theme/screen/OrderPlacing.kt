package com.example.androidprojecttr38.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidprojecttr38.R

@Composable
fun OrderPlacing(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .background(color = Color.White),
        contentAlignment = Alignment.Center) {
        Spacer(modifier = Modifier
            .height(60.dp))
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)) {

            OutlinedButton(onClick = {}, enabled = true, modifier = Modifier.width(32.dp)
                .height(32.dp), shape = RoundedCornerShape(1.dp)
            ) {
                Image(painter = painterResource(id = R.drawable.icons),
                    contentDescription = "ButtonBack",
                    modifier = Modifier)
            }
        }
    }
}

@Preview
@Composable
private fun OrderPlacingPrev() {
    OrderPlacing()
}