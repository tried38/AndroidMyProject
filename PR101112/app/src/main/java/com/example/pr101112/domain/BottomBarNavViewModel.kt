package com.example.pr101112.domain

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class BottomBarNavViewModel : ViewModel() {
    private val _categories = MutableStateFlow<List<String>>(
        listOf(
            "Популярные",
            "Covid",
            "Комплексные",
            "Чекапы",
            "Биохимия"
        )
    )
    val categories: StateFlow<List<String>> = _categories

    private val _cards = MutableStateFlow<List<TestsItem>>(
        listOf(
            TestsItem(1, "ПЦР-тест на определение РНК коронавируса стандартный", 2, 1800),
            TestsItem(2, "Клинический анализ крови с лейкоцитарной формулой", 1, 690),
            TestsItem(3, "Биохимический анализ крови, базовый", 1, 2440),
            TestsItem(4, "СОЭ (венозная кровь)", 1, 240),
            TestsItem(5, "Общий анализ мочи", 1, 1800),
            TestsItem(6, "Тироксин свободный (Т4 свободный)", 1, 1800)
        )
    )
    val cards: StateFlow<List<TestsItem>> = _cards
}