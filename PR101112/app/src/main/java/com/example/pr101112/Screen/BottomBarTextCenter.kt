package com.example.pr101112.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.pr101112.ui.theme.cardColor
import com.example.pr101112.domain.BottomBarNavViewModel



@Composable
fun TestsBottomBar(modifier: Modifier = Modifier,viewModel: BottomBarNavViewModel = viewModel()) {
    val categories by viewModel.categories.collectAsState()
    val cards by viewModel.cards.collectAsState()
    Column( modifier = modifier
        .fillMaxSize()
        .background(color = cardColor))
    {
        LazyRow(modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp))
        {
            items(categories) {category ->
                CategoriesButton(
                    title = category,
                    isSelected = true,
                    onClick = {  }
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn(
            modifier = Modifier
            .fillMaxSize())
        {
            items(cards) { item ->
                TestCard(item = item)
            }
        }
    }
}

@Composable
fun ResultsBottomBar(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Результаты"
        )
    }
}

@Composable
fun SupportBottomBar(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Поддержка"
        )
    }
}

@Composable
fun ProfileBottomBar(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Профиль"
        )
    }
}

@Preview
@Composable
private fun BottomBarPrev() {
    TestsBottomBar()
}