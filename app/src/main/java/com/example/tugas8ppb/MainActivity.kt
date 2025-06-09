package com.example.tugas8ppb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.tugas8ppb.ui.theme.Tugas8ppbTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tugas8ppbTheme {
                Surface {
                    DogList(dogs = sampleDogs)
                }
            }
        }
    }
}
