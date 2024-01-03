package com.example.hotelalvestruz.screens.itens_list_main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.hotelalvestruz.R
import com.example.hotelalvestruz.screens.Room
import com.example.hotelalvestruz.ui.theme.BlackBlue


@Composable
fun MainItens(
    room: Room
) {

    val roomImg = room.imgRoom
    val roomTxt = room.roomName
    val roomDesc = room.roomDescription
    val roomPrice = room.price

    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .background(BlackBlue)
            .padding(0.dp, 10.dp, 0.dp, 10.dp)
    ) {
        val (
            imgRoom,
            containerImg,
            txtRoomName,
            txtRoomDescription,
            txtPrice,
            btViewMore,
            rowItem
        ) = createRefs()

        Card(
            modifier = Modifier
                .constrainAs(containerImg) {
                    top.linkTo(parent.top, 0.dp)
                    start.linkTo(parent.start, 0.dp)
                }
                .size(130.dp)
                .padding(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            shape = ShapeDefaults.Medium,
            elevation = CardDefaults.cardElevation(
                defaultElevation = 8.dp
            )
        ) {
            Image(
                painter = painterResource(roomImg!!),
                contentDescription = null,
                modifier = Modifier
                    .layoutId(imgRoom)
                    .fillMaxSize()
            )
        }
        Text(
            text = roomTxt!!,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .constrainAs(txtRoomName) {
                    top.linkTo(parent.top, 30.dp)
                    start.linkTo(containerImg.end, 0.dp)
                }
        )
        Text(
            text = roomDesc!!,
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .constrainAs(txtRoomDescription) {
                    top.linkTo(txtRoomName.bottom)
                    start.linkTo(containerImg.end)
                    end.linkTo(
                        parent.end
                    )
                }
                .padding(0.dp, 10.dp, 40.dp, 0.dp),
            maxLines = 3
        )
        Text(
            text = roomPrice!!,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier
                .constrainAs(txtPrice) {
                    top.linkTo(txtRoomDescription.bottom, 20.dp)
                    start.linkTo(containerImg.end, 0.dp)
                }
        )
        Button(
            onClick = {},
            modifier = Modifier
                .constrainAs(btViewMore) {
                    top.linkTo(txtRoomDescription.bottom, 10.dp)
                    start.linkTo(txtPrice.end, 30.dp)
                    end.linkTo(parent.end, 10.dp)
                }
                .height(40.dp)
        ) {
            Text(
                text = stringResource(R.string.bt_view_more),
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
        Row(
            modifier = Modifier
                .width(350.dp)
                .height(3.dp)
                .background(Color.White)
                .constrainAs(rowItem) {
                    top.linkTo(btViewMore.bottom, 20.dp)
                    start.linkTo(parent.start, 10.dp)
                    end.linkTo(parent.end, 10.dp)
                }.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {

        }
    }
}