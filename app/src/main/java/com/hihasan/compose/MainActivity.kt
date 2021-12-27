package com.hihasan.compose

import android.os.Bundle
import android.widget.RelativeLayout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hihasan.compose.ui.theme.ComposeTheme
import com.hihasan.compose.ui.theme.Shapes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            helloWorld(writerBlock("Hasan", "Basics of Android Compose"))
        }
    }

    data class writerBlock(var author: String, var book: String)

    @Composable
    fun helloWorld(str: writerBlock) {
        Row() {
            Image(painter = painterResource(id = android.R.mipmap.sym_def_app_icon),
                contentDescription = "Profile Pic")
            Column() {
                Text(text = "welcome to ${str.author}")
                Text(text = "Book : ${str.book}")
            }
        }

    }
}
