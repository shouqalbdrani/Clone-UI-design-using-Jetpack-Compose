package com.example.uidesignusingcompose

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.TextStyle
import androidx.navigation.NavController

@Composable
fun SignUpScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var termsAccepted by remember { mutableStateOf(false) }

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
                text = stringResource(id = R.string.sign_up),
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
                label = stringResource(id = R.string.email)
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Password Input
            CustomTextField(
                value = password,
                onValueChange = { password = it },
                label = stringResource(id = R.string.password)
            )
            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {

                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .padding(top = 16.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0000FF))
            ) {
                Text(
                    text = stringResource(id = R.string.create_account),
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
            ) {
                Checkbox(
                    checked = termsAccepted,
                    onCheckedChange = { termsAccepted = it }
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = stringResource(id = R.string.terms_conditions),
                    color = Color.White,
                    style = TextStyle(fontSize = 14.sp)
                )
            }
            Text(
                text = stringResource(id = R.string.already_have_account),
                color = Color.White
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = stringResource(id = R.string.login),
                color = Color.Blue,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable {
                    navController.navigate("login_screen")

                }
            )

        }
    }
}
