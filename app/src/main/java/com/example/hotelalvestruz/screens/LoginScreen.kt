package com.example.hotelalvestruz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hotelalvestruz.R
import com.example.hotelalvestruz.screens.components.BorderCard
import com.example.hotelalvestruz.screens.components.TextFieldPassword
import com.example.hotelalvestruz.screens.components.TextFieldUsername
import com.example.hotelalvestruz.screens.components.TopBar
import com.example.hotelalvestruz.ui.theme.BlackBlue

@Composable
fun LoginScreen() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var remeberCheck by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = BlackBlue),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TopBar() {
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = stringResource(R.string.login_name),
            color = Color.White,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold
        )
        BorderCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 24.dp),
            shape = RoundedCornerShape(8.dp),
            borderWidth = 1.dp
        ) {
            Spacer(modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 50.dp))
            Column(
                modifier = Modifier.padding(all = 24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextFieldUsername(
                    value = username,
                    onValueChange = { username = it },
                    hint = stringResource(R.string.hint_username),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email
                    ),
                    modifier = Modifier
                        .padding(0.dp, 10.dp)
                )
                TextFieldPassword(
                    value = password,
                    onValueChange = { password = it },
                    hint = stringResource(R.string.hint_password),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.NumberPassword
                    ),
                    modifier = Modifier
                        .padding(0.dp, 10.dp)
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Checkbox(
                        checked = remeberCheck,
                        onCheckedChange = {
                            remeberCheck = !remeberCheck
                                },
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color.White,
                            uncheckedColor = Color.White,
                            checkmarkColor = Color.Black
                        )
                    )
                    Text(
                        text = stringResource(R.string.remember_me),
                        fontSize = 15.sp,
                        color = Color.White
                    )
                }
                Text(
                    text = stringResource(R.string.forgot_password),
                    fontSize = 15.sp,
                    color = Color.White,
                    modifier = Modifier
                        .padding(0.dp, 10.dp, 0.dp, 10.dp)
                )
                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .width(200.dp)
                        .height(90.dp)
                        .padding(0.dp, 20.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.White,
                        contentColor = Color.Black
                    ),
                    shape = RoundedCornerShape(8.dp)
                ) {
                    Text(
                        text = stringResource(R.string.txt_button),
                        fontSize = 14.sp,
                        color = Color.Black
                    )
                }
            }
        }
        Spacer(modifier = Modifier.weight(1f))
        Column(
            modifier = Modifier,
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .padding(20.dp, 0.dp, 20.dp, 20.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(R.string.txt_warning),
                    fontSize = 12.sp,
                    color = Color.White,
                    modifier = Modifier,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
@Preview
private fun LoginScreenPreview() {
        LoginScreen()
}