package com.example.hitemamovie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.hitemamovie.ui.screens.MainScreen
import com.example.hitemamovie.ui.theme.HitemaMovieTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HitemaMovieTheme {
                MainScreen()
            }
        }
    }
}