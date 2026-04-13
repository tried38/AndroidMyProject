package com.example.androidprojecttr38.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.androidprojecttr38.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)



val RobotoFamily = FontFamily(
    Font(R.font.roboto, FontWeight.Normal) ,
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_bold, FontWeight.Bold),
    Font(R.font.roboto_black, FontWeight.Black),
    Font(R.font.roboto_mono_semibold, FontWeight.SemiBold),
    Font(R.font.roboto_serif_extrabold, FontWeight.ExtraBold))

@Immutable
data class CustomTypography(
    val headingBlack128: TextStyle,
    val headingBlack96: TextStyle,
    val headingExtraBold64: TextStyle,
    val headingExtrabold36: TextStyle,
    val headingBold36: TextStyle,
    val headingBold24: TextStyle,
    val headingMedium24: TextStyle,
    val headingSemiBold20: TextStyle,
    val headingMedium20: TextStyle,
    val headingMedium18: TextStyle,
    val subtitleMedium18: TextStyle,
    val SubtitleBold16: TextStyle,
    val Subtitlemedium16: TextStyle,
    val Subtitleregular16: TextStyle,
    val BodySemibold14: TextStyle,
    val Bodymedium14: TextStyle,
    val Bodyregular14: TextStyle,
    val Bodymedium12: TextStyle,
    val Bodyregular12: TextStyle,
)

val LocalAppTypography = staticCompositionLocalOf {
    CustomTypography(
        headingBlack128 = TextStyle.Default,
        headingBlack96 = TextStyle.Default,
        headingExtraBold64 = TextStyle.Default,
        headingExtrabold36= TextStyle.Default,
        headingBold36= TextStyle.Default,
        headingBold24= TextStyle.Default,
        headingMedium24= TextStyle.Default,
        headingSemiBold20= TextStyle.Default,
        headingMedium20= TextStyle.Default,
        headingMedium18= TextStyle.Default,
        subtitleMedium18= TextStyle.Default,
        SubtitleBold16= TextStyle.Default,
        Subtitlemedium16= TextStyle.Default,
        Subtitleregular16= TextStyle.Default,
        BodySemibold14= TextStyle.Default,
        Bodymedium14= TextStyle.Default,
        Bodyregular14= TextStyle.Default,
        Bodymedium12= TextStyle.Default,
        Bodyregular12= TextStyle.Default
    )}