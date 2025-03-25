package com.example.uidesignusingcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
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
fun SecondScreen(navController: NavController, modifier: Modifier = Modifier) {
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
                painter = painterResource(id = R.drawable.login2),
                contentDescription = "Second Screen Image",
                modifier = Modifier.matchParentSize()
            )

        }
        Spacer(modifier = Modifier.height(16.dp))
        BigText(
            text = stringResource(id = R.string.quick_learning),
            Color.White,
            24.sp,
            textAlign = TextAlign.Center
        )
    }
    SmallText(
        text = stringResource(id = R.string.easy_learning_description),
        color = Color.White,
        fontSize = 16.sp, textAlign = TextAlign.Center
    )
    Spacer(modifier = Modifier.height(24.dp))


    Button(
        modifier = modifier.padding(top = 680.dp , start = 160.dp),
        onClick = { navController.navigate("third_screen") }
    ) {
        Text(stringResource(id = R.string.next_button))


    }
}
