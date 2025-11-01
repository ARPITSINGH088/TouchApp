package com.example.touchapp
import androidx.lifecycle.ViewModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.touchapp.ui.theme.TouchAppTheme
import com.example.touchapp.ui.theme.screens.HomeScreen
import com.example.touchapp.viewmodel.TouchViewModel

class MainActivity : ComponentActivity() {
    private val homeViewModel: TouchViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HomeScreen(viewModel = homeViewModel)
            }
        }
    }



