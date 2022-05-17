package com.hihasan.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.hihasan.compose.ui.theme.ComposeTheme
import com.hihasan.compose.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Column {
                        HelloWorld("Hi Hasan")
                        DefaultPreview()
                    }
                }
            }
        }
    }

    @Composable
    fun HelloWorld(test : String) {
        Text(
            text = "$test",
            style = Typography.h5
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview(){
        ComposeTheme {
            Column {
                HelloWorld(test = "This is My First")
                HelloWorld(test = "Android Compose Test")
            }
        }
    }
}
