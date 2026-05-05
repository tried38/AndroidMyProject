package com.example.pr101112.Screen


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pr101112.R
import com.example.pr101112.ui.theme.bottombarnotactive
import com.example.pr101112.ui.theme.bottomnavactive

enum class BottomDestinations(
    val label: String,
    val iconId: Int,
    val route: Any
) {
    Tests("Анализы", R.drawable.tests, TestsScreen),
    Results("Результаты", R.drawable.results, ResultsScreen),
    Support("Поддержка", R.drawable.tests, SupportScreen),
    Profile("Профиль", R.drawable.tests, ProfileScreen)
} 

@Composable
fun BottomBarNav() {
    val navController = rememberNavController()

    val startDestination = BottomDestinations.Tests
    var selectedIndex by rememberSaveable { mutableIntStateOf(startDestination.ordinal) }

    val navColors = NavigationBarItemDefaults.colors(
        selectedIconColor = bottomnavactive,
        selectedTextColor = bottomnavactive,
        unselectedIconColor = bottombarnotactive,
        unselectedTextColor = bottombarnotactive,
        indicatorColor = Color.Transparent
    )

    Scaffold(
        modifier = Modifier,
        bottomBar = {
            NavigationBar(containerColor = Color.White, windowInsets = NavigationBarDefaults.windowInsets) {
                BottomDestinations.entries.forEachIndexed { index, destination ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = {
                            navController.navigate(route = destination.route)
                            selectedIndex = index
                        },
                        icon = {
                            Icon(
                                ImageVector.vectorResource(destination.iconId),
                                contentDescription = destination.label
                            )
                        },
                        label = { Text(destination.label) },
                        colors = navColors
                    )
                }
            }
        }
    ) { contentPadding ->
        NavHost(
            navController = navController,
            startDestination = TestsScreen,
            modifier = Modifier.padding(contentPadding)
        ) {
            composable<TestsScreen> { TestsBottomBar() }
            composable<ResultsScreen> { ResultsBottomBar() }
            composable<SupportScreen> { SupportBottomBar() }
            composable<ProfileScreen> { ProfileBottomBar() }
        }
    }
}

@Preview
@Composable
private fun BottomBarNavPrev() {
    BottomBarNav()
}