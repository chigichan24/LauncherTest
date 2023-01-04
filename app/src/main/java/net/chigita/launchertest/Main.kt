package net.chigita.launchertest

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.moriatsushi.launcher.Entry

@Entry(default = true)
@Composable
fun Main() {
    MaterialTheme {
        Text(text = "HELLO", color = Color.Blue)
    }
}
