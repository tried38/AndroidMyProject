package com.example.androidprojecttr38.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.androidprojecttr38.R
import com.example.androidprojecttr38.ui.theme.Components.PrimaryButton
import com.example.androidprojecttr38.ui.theme.Components.SecondaryButton
import com.example.androidprojecttr38.ui.theme.MainButtonActive_pr05

@Composable
fun PaymentScreen(  modifier: Modifier = Modifier,
                    navController: androidx.navigation.NavHostController,
                    PaymentText:String,
                    SomeImage: Int,
                    FirstText:String,
                    SecondText:String,
                    PaymentTextButton: String,
                    OnMainPage: String) {
    Column(modifier = modifier
        .background(color = Color.White)
        .padding(start = 16.dp, end = 32.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacer(Modifier.height(60.dp))
        Text(
            text = PaymentText,
            fontSize = 20.sp,
            fontWeight = FontWeight(600),
            lineHeight = 28.sp,
            modifier = Modifier
        )

        Spacer(Modifier.height(64.dp))
        Image(
            painter = painterResource(id = SomeImage),
            contentDescription = "",
            modifier = Modifier.size(204.dp,200.dp)
        )
        Spacer(Modifier.height(31.dp))
        Text(
            text = FirstText,
            color = Color.Green,
            fontSize = 20.sp,
            fontWeight = FontWeight(600),
            lineHeight = 28.sp,
            modifier = Modifier
        )
        Spacer(Modifier.height(10.dp))
        Text(
            text = SecondText,
            color = Color.Gray,
            fontSize = 14.sp,
            fontWeight = FontWeight(400),
            lineHeight = 20.sp,
            modifier = Modifier.size(width = 291.dp, height = 60.dp),
            textAlign = TextAlign.Center
        )

        Spacer(Modifier.height(10.dp))

        val annotatedString = buildAnnotatedString {
            withStyle(SpanStyle(color = Color.Gray)){
                append("Не забудьте ознакомиться с ")}
            appendInlineContent("icon", "[icon]")
            withStyle(SpanStyle(color = MainButtonActive_pr05)) {
                append(" правилами подготовки к сдаче анализов")
            }
        }

        Text(
            text = annotatedString,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 36.dp),
            textAlign = TextAlign.Center,
            style = TextStyle(lineHeight = 20.sp),
            inlineContent = mapOf(
                "icon" to InlineTextContent(
                    Placeholder(16.sp, 16.sp, PlaceholderVerticalAlign.Center)
                ) {
                    Image(
                        painter = painterResource(R.drawable.sheet),
                        contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    )
                }
            )
        )
        Spacer(Modifier.height(97.dp))
        SecondaryButton(PaymentTextButton,modifier = Modifier) {  }
        Spacer(Modifier.height(20.dp))
        Button(
            onClick = { navController.navigate(SignUpScreen) },
            modifier = Modifier
                .width(335.dp)
                .height(56.dp),
            shape = RoundedCornerShape(12.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MainButtonActive_pr05,
                contentColor = Color.White,
                disabledContainerColor = MainButtonActive_pr05,
                disabledContentColor = Color.White
            )
        ) {
            Text(
                text = OnMainPage,
                fontSize = 17.sp,
                fontWeight = FontWeight(600)
            )
        }
    }

}

@Preview
@Composable
private fun PaymentScreenPrev() {
    val navController = rememberNavController()
    PaymentScreen(
        PaymentText = "Оплата",
        SomeImage = R.drawable.illustration,
        FirstText = "Ваш заказ успешно оплачен!",
        SecondText = "Вам осталось дождаться приезда медсестры и сдать анализы. \n" +
                "До скорой встречи!",
        PaymentTextButton = "Чек покупки",
        OnMainPage = "На главную",
        navController = navController,
    )
}