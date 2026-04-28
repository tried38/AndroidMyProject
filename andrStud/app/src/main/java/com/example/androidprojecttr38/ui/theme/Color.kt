package com.example.androidprojecttr38.ui.theme

import android.widget.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)


//pr04
val AccentColor = Color(0xFF00B712)
val MainButtonActive_pr04 = Color(0xFF1A6FEE)
val MainButtonInactive = Color(0xFFC9D4FB)
val AnotherButton = Color(0xFFC9D4FB)
val TextButtonColor = Color(0xFFC9D4FB)


//pr05
val MainButtonActive_pr05 = Color(0xFF1A6FEE)
val MainButtonINActive_pr05 = Color(0xFFC94DFB)


//pr06
val WelcomeScreenBlue = Color(0xFF57A9FF)
val WelcomeScreenGreen = Color(0xFF00B712)
val WelcomeScreenGray = Color(0xFF939396)



//pr07
@Immutable
data class CustomColors(
    val PrimaryColor: Color,
    val SecondaryColor: Color,
    val success: Color,
    val error: Color,
    val warning: Color,
    val inform: Color,
    val blackText1: Color,
    val blackText2: Color,
    val grayColor1: Color,
    val grayColor2: Color,
    val whiteColor: Color,
)

val LocalAppColors = staticCompositionLocalOf {
    CustomColors(
        PrimaryColor = Color.Unspecified,
        SecondaryColor = Color.Unspecified,
        success = Color.Unspecified,
        error = Color.Unspecified,
        warning = Color.Unspecified,
        inform = Color.Unspecified,
        blackText1 = Color.Unspecified,
        blackText2 = Color.Unspecified,
        grayColor1 = Color.Unspecified,
        grayColor2 = Color.Unspecified,
        whiteColor = Color.Unspecified

    )
}

val ButtonBackColor = Color.Gray