package com.example.touchapp.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.touchapp.data.model.StoryData

@Composable
fun StoryItem(story: StoryData) {
    Column(
        modifier = Modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = rememberAsyncImagePainter(story.profileImage),
            contentDescription = story.username,
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Magenta, CircleShape)
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = story.username,
            color = Color.Black,
            textAlign = TextAlign.Center,
            maxLines = 1
        )
    }
}