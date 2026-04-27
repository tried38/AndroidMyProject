package com.example.androidprojecttr38

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidprojecttr38.ui.theme.MyCustomTheme
import com.example.androidprojecttr38.ui.theme.screen.SignUp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyCustomTheme {
                SignUp(        welcomeText = "Добро пожаловать!",
                    descriptionText = "Войдите, чтобы пользоваться функциями приложения",
                    emailLabelText = "Вход по E-mail",
                    emailPlaceholderText = "example@mail.ru",
                    nextButtonText = "Далее",
                    orText = "Или войдите с помощью",
                    yandexButtonText = "Войти с Яндекс")
                }
            }
        }
    }

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    SignUp()
//}


@Preview
@Composable
private fun SignUpPrev() {
    SignUp(        welcomeText = "Добро пожаловать!",
        descriptionText = "Войдите, чтобы пользоваться функциями приложения",
        emailLabelText = "Вход по E-mail",
        emailPlaceholderText = "example@mail.ru",
        nextButtonText = "Далее",
        orText = "Или войдите с помощью",
        yandexButtonText = "Войти с Яндекс")
}