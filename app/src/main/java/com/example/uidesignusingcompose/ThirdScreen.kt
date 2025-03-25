package com.example.uidesignusingcompose


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun ThirdScreen() {
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
                contentDescription = "First Screen Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.matchParentSize()
            )
        }
        Spacer (modifier = Modifier.height(16.dp))
        BigText(text = " Create your own study plan" ,
            Color.White,
            24.sp,
            textAlign = TextAlign.Center)
    }
    SmallText(
        text = "Study according to the study plan, make study more motivated" ,
        color = Color.White,
        fontSize = 16.sp ,textAlign = TextAlign.Center
    )
    Spacer(modifier = Modifier.height(16.dp))
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 730.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ){
        ButtonShape(
            text = "Sign up",
            onClick = {},
            backgroundColor = Color(0xFF0000FF),
            textColor = Color.White,
        )
        ButtonShape(
            text = "Log in ",
            onClick = {},
            backgroundColor = Color(0xFF808080),
            textColor = Color.White,
        )

    }


}
