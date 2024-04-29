package Image_and_icon_manipulations

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.singleWindowApplication

fun main() = singleWindowApplication {
    Image(
        painter = painterResource("resources/sample.png"),
        contentDescription = "Sample",
        modifier = Modifier.fillMaxSize()
    )
}