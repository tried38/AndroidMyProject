package com.example.androidprojecttr38

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidprojecttr38.ui.theme.MyCustomTheme
import com.example.androidprojecttr38.ui.theme.screen.OrderPlacing
import com.example.androidprojecttr38.ui.theme.screen.OrderPlacingScreen
import com.example.androidprojecttr38.ui.theme.screen.PaymentScreen
import com.example.androidprojecttr38.ui.theme.screen.SignUp
import com.example.androidprojecttr38.ui.theme.screen.SignUpScreen
import com.example.androidprojecttr38.ui.theme.screen.paymentScreen

//pr05
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            MyCustomTheme {
//                SignUp(        welcomeText = "Добро пожаловать!",
//                    descriptionText = "Войдите, чтобы пользоваться функциями приложения",
//                    emailLabelText = "Вход по E-mail",
//                    emailPlaceholderText = "example@mail.ru",
//                    nextButtonText = "Далее",
//                    orText = "Или войдите с помощью",
//                    yandexButtonText = "Войти с Яндекс")
//                }
//            }
//        }
//    }
//
//
//@Preview
//@Composable
//private fun SignUpPrev() {
//    SignUp(        welcomeText = "Добро пожаловать!",
//        descriptionText = "Войдите, чтобы пользоваться функциями приложения",
//        emailLabelText = "Вход по E-mail",
//        emailPlaceholderText = "example@mail.ru",
//        nextButtonText = "Далее",
//        orText = "Или войдите с помощью",
//        yandexButtonText = "Войти с Яндекс")
//}




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyCustomTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = SignUpScreen)
                {
                    composable<SignUpScreen> {SignUp(
                        welcomeText = "Добро пожаловать!",
                        descriptionText = "Войдите, чтобы пользоваться функциями приложения",
                        emailLabelText = "Вход по E-mail",
                        emailPlaceholderText = "example@mail.ru",
                        nextButtonText = "Далее",
                        orText = "Или войдите с помощью",
                        yandexButtonText = "Войти с Яндекс",
                        navController = navController
                    )}
                    composable<OrderPlacingScreen>{ OrderPlacing(        modifier = Modifier,
                        OrderText = "Оформление заказа",
                        AdressText =  "Введите ваш адрес",
                        PhoneText =  "Введите ваш номер телефона",
                        PromocodeText =  "Промокод",
                        ComentText =  "Можете оставить свои пожелания",
                        CountAnaliz =  "1 анализ",
                        CostAll =  "690 рублей",
                        buttnTXT =  "Заказать",
                        navController = navController) }

                    composable<paymentScreen>{ PaymentScreen(
                            PaymentText = "Оплата",
                            SomeImage = R.drawable.illustration,
                            FirstText = "Ваш заказ успешно оплачен!",
                            SecondText = "Вам осталось дождаться приезда медсестры и сдать анализы. \n" +
                                    "До скорой встречи!",
                            PaymentTextButton = "check",
                            OnMainPage = "Back",
                            navController = navController,
                        ) }
                }
            }
        }
    }
}


@Preview
@Composable
private fun SignUpPrev() {
    val navController = rememberNavController()
    SignUp(
        welcomeText = "Добро пожаловать!",
        descriptionText = "Войдите, чтобы пользоваться функциями приложения",
        emailLabelText = "Вход по E-mail",
        emailPlaceholderText = "example@mail.ru",
        nextButtonText = "Далее",
        orText = "Или войдите с помощью",
        yandexButtonText = "Войти с Яндекс",
        navController =navController
    )
}