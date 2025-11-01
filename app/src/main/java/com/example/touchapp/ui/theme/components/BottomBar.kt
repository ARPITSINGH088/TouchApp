package com.example.touchapp.ui.theme.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Fill
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.touchapp.R

@Composable
fun BottomBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        // Draw the background curve
        Canvas(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
        ) {
            val width = size.width
            val height = size.height

            val path = Path().apply {
                moveTo(0f, 0f)

                quadraticBezierTo(
                    width / 2, -60f,
                    width, 0f
                )
                lineTo(width, height)
                lineTo(0f, height)
                close()
            }

            drawPath(path, color = Color(0xFFFF00A0), style = Fill)
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 25.dp, vertical = 10.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.Bottom
        ) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home",
                modifier = Modifier.size(28.dp),
                tint = Color.Black
            )

            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search",
                modifier = Modifier.size(28.dp),
                tint = Color.Black
            )

            Icon(
                painter = painterResource(id = R.drawable.spy_icon),
                contentDescription = "Spy",
                modifier = Modifier.size(40.dp),
                tint = Color.Unspecified
            )

            Icon(
                painter = painterResource(id = R.drawable.reels_icon),
                contentDescription = "Reels",
                modifier = Modifier.size(28.dp),
                tint = Color.Unspecified
            )

            Icon(
                painter = painterResource(id = R.drawable.add_square_icon),
                contentDescription = "Add",
                modifier = Modifier.size(28.dp),
                tint = Color.Unspecified
            )
        }
    }
}
