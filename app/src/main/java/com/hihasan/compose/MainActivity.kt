package com.hihasan.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    fun HelloWorld(test: String) {
        Text(
            text = "$test",
            style = Typography.h5
        )
    }

    @Composable
    fun RowScope.CustomItem(weight : Float, color : Color = MaterialTheme.colors.primary){
        Surface(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .weight(weight),
            color = color

        ) {}
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        ComposeTheme {
            Row(
                modifier = Modifier.height(500.dp),
                horizontalArrangement = Arrangement.Start
            ) {
                CustomItem(weight = 3f, color = MaterialTheme.colors.secondary)
                CustomItem(weight = 1f)

            }
        }
    }
}
