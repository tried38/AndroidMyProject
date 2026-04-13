package com.example.androidprojecttr38.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androidprojecttr38.R
import com.example.androidprojecttr38.ui.theme.RobotoFamily

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun MyCustomTheme(
    content: @Composable () -> Unit
) {
    val colors = CustomColors(
        PrimaryColor = Color(0xFF0560FA),
        SecondaryColor = Color(0xFFEC8000),
        success = Color(0xFF35B369),
        error = Color(0xFFED3A3A),
        warning = Color(0xFFEBBC2E),
        inform = Color(0xFF2F80ED),
        blackText1 = Color(0xFF3A3A3A),
        blackText2 = Color(0xFF141414),
        grayColor1 = Color(0xFFCFCFCF),
        grayColor2 = Color(0xFFA7A7A7),
        whiteColor = Color(0xFFFFFFFF)
    )
    val typography = CustomTypography(
        headingBlack128 = TextStyle(fontSize = 128.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.Black),
        headingBlack96 = TextStyle(fontSize = 96.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.Black),
        headingExtraBold64 = TextStyle(fontSize = 64.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.ExtraBold),
        headingExtrabold36= TextStyle(fontSize = 36.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.ExtraBold),
        headingBold36= TextStyle(fontSize = 36.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.Bold),
        headingBold24= TextStyle(fontSize = 24.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.Bold),
        headingMedium24= TextStyle(fontSize = 24.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.Medium),
        headingSemiBold20= TextStyle(fontSize = 20.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.SemiBold),
        headingMedium20= TextStyle(fontSize = 20.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.Medium),
        headingMedium18= TextStyle(fontSize = 18.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.Medium),
        subtitleMedium18= TextStyle(fontSize = 18.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.Medium),
        SubtitleBold16= TextStyle(fontSize = 16.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.Bold),
        Subtitlemedium16= TextStyle(fontSize = 16.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.Medium),
        Subtitleregular16= TextStyle(fontSize = 16.sp, fontFamily = RobotoFamily),
        BodySemibold14= TextStyle(fontSize = 14.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.SemiBold),
        Bodymedium14= TextStyle(fontSize = 14.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.Medium),
        Bodyregular14= TextStyle(fontSize = 14.sp, fontFamily = RobotoFamily),
        Bodymedium12= TextStyle(fontSize = 12.sp, fontFamily = RobotoFamily, fontWeight = FontWeight.Medium),
        Bodyregular12= TextStyle(fontSize = 12.sp, fontFamily = RobotoFamily)
    )
    CompositionLocalProvider(
        LocalAppColors provides colors,
        LocalAppTypography provides typography
    ) {
        content()
    }
}

object MyCustomTheme {
    val typography: CustomTypography
        @Composable
        get() = LocalAppTypography.current
    val colors: CustomColors
        @Composable
        get() = LocalAppColors.current
}