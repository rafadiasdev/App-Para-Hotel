package com.example.hotelalvestruz.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hotelalvestruz.R
import com.example.hotelalvestruz.screens.components.TopBar
import com.example.hotelalvestruz.screens.itens_list_main.MainItens
import com.example.hotelalvestruz.ui.theme.BlackBlue

@Composable
fun MainScreen() {

    val roomList: MutableList<Room> = mutableListOf(
        Room(
            imgRoom = R.drawable.room_one,
            roomName = stringResource(R.string.txt_room1),
            roomDescription = stringResource(R.string.txt_room1_description),
            price = stringResource(R.string.price_room1)
        ),
        Room(
            imgRoom = R.drawable.room_two,
            roomName = stringResource(R.string.txt_room2),
            roomDescription = stringResource(R.string.txt_room2_description),
            price = stringResource(R.string.price_room2)
        ),
        Room(
            imgRoom = R.drawable.room_three,
            roomName = stringResource(R.string.txt_room3),
            roomDescription = stringResource(R.string.txt_room3_description),
            price = stringResource(R.string.price_room3)
        ),
        Room(
            imgRoom = R.drawable.room_for,
            roomName = stringResource(R.string.txt_room4),
            roomDescription = stringResource(R.string.txt_room4_description),
            price = stringResource(R.string.price_room4)
        ),
        Room(
            imgRoom = R.drawable.room_five,
            roomName = stringResource(R.string.txt_room5),
            roomDescription = stringResource(R.string.txt_room5_description),
            price = stringResource(R.string.price_room5)
        )
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = BlackBlue)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TopBar {
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp, 20.dp, 0.dp, 10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = stringResource(R.string.txt_main),
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold
            )
        }
        LazyColumn() {
            itemsIndexed(roomList) {
                position, Room ->
                MainItens(Room)
            }
        }
    }
}



@Composable
@Preview
private fun MainScreenPreview() {
    MainScreen()
}
