package com.example.touchapp.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.touchapp.R

import com.example.touchapp.data.model.PostData

@Composable
fun PostCard(post: PostData) {
    Column(modifier = Modifier.fillMaxWidth()) {
        // Header
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
        ) {
            Image(
                painter = rememberAsyncImagePainter(post.profileImage),
                contentDescription = post.username,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = post.username, color = Color.Black)
                Text(text = post.date, color = Color.Gray)
            }
            Spacer(modifier = Modifier.weight(1f))
            Text(text = "Follow", color = Color.White, modifier = Modifier
                .clip(androidx.compose.foundation.shape.RoundedCornerShape(8.dp))
                .background(Color.Magenta)
                .padding(horizontal = 12.dp, vertical = 4.dp))
        }

        // Image
        Image(
            painter = rememberAsyncImagePainter(post.imageUrl),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(350.dp)
        )

        // Stats Row
        Row(
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
            verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.FavoriteBorder,
                contentDescription = "Like",
                modifier = Modifier.size(28.dp),
                // FIX: Explicitly set the tint color
                tint = Color.Black
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = post.comments)
            Spacer(modifier = Modifier.width(16.dp))
            Icon(
                imageVector = Icons.Default.Send,
                contentDescription = "Send",
                modifier = Modifier.size(28.dp),

                tint = Color.Black
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = post.likes)
        }

        // Description
        Column(modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp)) {
            Text(text = "${post.username}: ${post.description}")
            Text(text = post.location, color = Color.Gray)
        }
    }
}