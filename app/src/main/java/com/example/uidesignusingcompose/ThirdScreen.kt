package com.example.uidesignusingcompose


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ThirdScreen(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF3E1D7D))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.login3),
                contentDescription = "Third Screen Image",
                modifier = Modifier.matchParentSize()
            )
            Spacer(modifier = Modifier.height(16.dp))
        }
        BigText(
            text = stringResource(id = R.string.create_study_plan),
            Color.White,
            24.sp,
            TextAlign.Center
        )
    }
            SmallText(
                text = stringResource(id = R.string.study_plan_description),
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 700.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            ButtonShape(
                text = stringResource(id = R.string.signup_button),
                onClick = { navController.navigate("signup_screen") },
                backgroundColor = Color(0xFF0000FF),
                textColor = Color.White
            )

            ButtonShape(
                text = stringResource(id = R.string.login_button),
                onClick = { navController.navigate("login_screen") },
                backgroundColor = Color(0xFF808080),
                textColor = Color.White
            )
        }
    }

