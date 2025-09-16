package com.example.problem2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.problem2.ui.theme.Problem2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Problem2Theme {
                AssignmentPreview()
            }
        }
    }
}

@Composable
fun ToggleCard() {
    var text by remember { mutableStateOf("Tap to see a fun fact!") }

    Card {
        Button(onClick = {
            text = if (text == "Tap to see a fun fact!") {
                "Kotlin was created by JetBrains"
            } else {
                "Tap to see a fun fact!"
            }
        }) {
            Box(    // Box used to center the text
                modifier = Modifier     // modifier combination 2
                    .padding(10.dp)
                ,

                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = text
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun AssignmentPreview() {
    Problem2Theme {
        ToggleCard()
    }
}