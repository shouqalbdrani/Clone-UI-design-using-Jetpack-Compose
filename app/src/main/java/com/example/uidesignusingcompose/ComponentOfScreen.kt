package com.example.uidesignusingcompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton

import androidx.compose.ui.res.painterResource





@Composable
fun BigText(
    text: String,
    color: Color = White,
    fontSize: TextUnit = 24.sp,
    textAlign: TextAlign = TextAlign.Center,
    modifier : Modifier = Modifier
) {
    Text(
        text = text,
        color = color,
        fontSize = fontSize,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = modifier
            .fillMaxWidth()
            .padding(80.dp)
    )
}

@Composable
fun SmallText(
    text: String,
    color: Color = White,
    fontSize: TextUnit = 16.sp,
    textAlign: TextAlign = TextAlign.Center,
    modifier : Modifier = Modifier
) {
        Text(
            text = text,
            color = color,
            fontSize = fontSize,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center,
            modifier = modifier
                .fillMaxWidth()
                .padding(top = 600.dp ,start = 80.dp , end = 80.dp)

            )
    }

@Composable
fun ButtonShape(
    text: String,
    onClick: () -> Unit,
    backgroundColor: Color,
    textColor: Color = White,
    fontSize: TextUnit = 16.sp,
    shape: Shape = RoundedCornerShape(12.dp),
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = backgroundColor),
        shape = shape,
        modifier = Modifier
            .width(200.dp)
            .height(70.dp)
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(
            text = text,
            color = textColor,
            fontSize = fontSize,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun CustomTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String = "",
    backgroundColor: Color = Color.Transparent,
    textColor: Color = Color.White,
    borderColor: Color = Color.Gray,
    modifier: Modifier = Modifier
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        textStyle = TextStyle(color = textColor),
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = borderColor,
            unfocusedBorderColor = borderColor,
            cursorColor = Color.Gray,
            focusedLabelColor = Color.Gray
        ),
        modifier = modifier
           // .fillMaxWidth()
            .width(400.dp)
            .height(60.dp),
        singleLine = true
    )
}

@Composable
fun SocialLoginButtons(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 32.dp)
            .clickable { println("Social buttons clicked!") },
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { println("Google Login Clicked!") },
            modifier = Modifier
                .size(50.dp)
                .background(Color.White, shape = CircleShape)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_google),
                contentDescription = "Google Login",
                tint = Color.Unspecified
            )
        }

        Spacer(modifier = Modifier.width(16.dp))

        IconButton(
            onClick = { println("Facebook Login Clicked!") },
            modifier = Modifier
                .size(50.dp)
                .background(Color.White, shape = CircleShape)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_facebook),
                contentDescription = "Facebook Login",
                tint = Color.Unspecified
            )
        }
    }
}

