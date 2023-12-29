package com.example.hotelalvestruz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hotelalvestruz.R
import com.example.hotelalvestruz.screens.components.TextFieldPassword
import com.example.hotelalvestruz.screens.components.TextFieldUsername
import com.example.hotelalvestruz.ui.theme.Navy

@Composable
fun LoginScreen() {
    var username by remember {mutableStateOf("")}
    var password by remember {mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Navy),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = stringResource(R.string.login_name),
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold
        )
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextFieldUsername(
                value = username,
                onValueChange = {username = it},
                hint = stringResource(R.string.hint_username),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                ),
                modifier = Modifier
                    .padding(0.dp, 20.dp)
            )
            TextFieldPassword(
                value = password,
                onValueChange = {password = it},
                hint = stringResource(R.string.hint_password),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.NumberPassword
                ),
                modifier = Modifier
                    .padding(0.dp, 20.dp)
            )
        }
    }
}

@Composable
@Preview
private fun LoginScreenPreview() {
        LoginScreen()
}