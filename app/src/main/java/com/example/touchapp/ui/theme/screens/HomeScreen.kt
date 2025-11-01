package com.example.touchapp.ui.theme.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.touchapp.R
import com.example.touchapp.ui.theme.components.BottomBar
import com.example.touchapp.ui.theme.components.PostCard
import com.example.touchapp.ui.theme.components.StoryItem
import com.example.touchapp.viewmodel.TouchViewModel

@Composable
fun HomeScreen(viewModel: TouchViewModel) {
    val stories = viewModel.stories.collectAsState()
    val posts = viewModel.posts.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        // Top bar
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFFF00A0))
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "TOUCH",
                color = Color.Black,
                fontSize = 30.sp, )
        }




        // Stories Row
        LazyRow(modifier = Modifier.padding(1.dp)) {
            items(stories.value) { story ->
                StoryItem(story)
            }
        }
        Divider(
            color = Color.LightGray,
            thickness = 1.dp
        )


        // Feed
        LazyColumn(modifier = Modifier.weight(1f)) {
            items(posts.value) { post ->
                PostCard(post)
                Divider(
                    color = Color.Black,
                    thickness = 0.4.dp
                )
            }
        }


        BottomBar()
    }
}