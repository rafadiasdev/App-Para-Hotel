package com.example.hotelalvestruz.screens.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.hotelalvestruz.ui.theme.BlackBlue

@Composable
fun BorderCard(
    modifier: Modifier = Modifier,
    shape: Shape = RoundedCornerShape(size = 0.dp),
    borderWidth: Dp = 4.dp,
    content: @Composable () -> Unit
    ) {
    Surface(
        modifier = modifier,
        shape = shape
    ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .padding(borderWidth),
            color = BlackBlue,
            shape = shape
        ) {
            content()
        }
    }
}