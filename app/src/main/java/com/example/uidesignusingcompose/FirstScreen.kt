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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun FirstScreen(navController: NavController, modifier: Modifier = Modifier) {
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
                painter = painterResource(id = R.drawable.firstscreenimg),
                contentDescription = "First Screen Image",
                modifier = Modifier.matchParentSize()
            )

        }
        Spacer(modifier = Modifier.height(16.dp))
        BigText(
            text = " Numerous free trial courses",
            Color.White,
            24.sp,
            textAlign = TextAlign.Center
        )
    }
    SmallText(
        text = "Free courses for you to find your way to learning",
        color = Color.White,
        fontSize = 16.sp, textAlign = TextAlign.Center
    )
    Spacer(modifier = Modifier.height(24.dp))

    // Button to navigate to the Second Screen
    Button(
        modifier = modifier.padding(top = 680.dp , start = 160.dp),
        onClick = { navController.navigate("second_screen") }
    ) {
        Text("Next")


    }
}
