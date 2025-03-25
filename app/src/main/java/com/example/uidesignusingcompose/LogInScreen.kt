package com.example.uidesignusingcompose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.style.TextDecoration
import androidx.navigation.NavController

@Composable
fun LogInScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF3E1D7D))
            .padding(20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .padding(40.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.login_title),
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp)
            )

            CustomTextField(
                value = email,
                onValueChange = { email = it },
                label = stringResource(id = R.string.email_label)
            )

            Spacer(modifier = Modifier.height(16.dp))

            CustomTextField(
                value = password,
                onValueChange = { password = it },
                label = stringResource(id = R.string.password_label)
            )

            Spacer(modifier = Modifier.height(16.dp))

            TextButton(onClick = {
              //  println(stringResource(id = R.string.forgot_password))
            }) {
                Text(
                    text = stringResource(id = R.string.forgot_password),
                    color = Color.White,
                    textDecoration = TextDecoration.Underline
                )
            }

            Spacer(modifier = Modifier.height(14.dp))

            Button(
                onClick = {
                    //println(stringResource(id = R.string.login_button))
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .padding(top = 16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0000FF))
            ) {
                Text(
                    text = stringResource(id = R.string.login_button),
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }

            Spacer(modifier = Modifier.height(14.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = R.string.signup_prompt),
                    color = Color.White
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = stringResource(id = R.string.signup_button),
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.clickable {
                        navController.navigate("signup_screen")

                    }
                )
            }
        }
        SocialLoginButtons(
            modifier = Modifier.align(Alignment.BottomCenter)
                .padding(32.dp)
        )
    }
}
