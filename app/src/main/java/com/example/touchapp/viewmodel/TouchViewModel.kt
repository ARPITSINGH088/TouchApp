package com.example.touchapp.viewmodel

import androidx.lifecycle.ViewModel

import com.example.touchapp.data.model.PostData
import com.example.touchapp.data.model.StoryData
import com.example.touchapp.data.repository.TouchRepo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TouchViewModel : ViewModel() {
    private val repo = TouchRepo()

    private val _stories = MutableStateFlow<List<StoryData>>(emptyList())
    val stories: StateFlow<List<StoryData>> = _stories


    private val _posts = MutableStateFlow<List<PostData>>(emptyList())
    val posts: StateFlow<List<PostData>> =_posts

    init {
        loadData()
    }


    private fun loadData() {
        _stories.value = repo.getStories()
        _posts.value = repo.getPosts()
    }
}