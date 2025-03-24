package ru.myproject.jobsearch.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.myproject.jobsearch.ui.theme.Green
import ru.myproject.jobsearch.ui.theme.Grey1
import ru.myproject.jobsearch.ui.theme.White

@Composable
fun ButtonMaximumRounding(
    onClick:()-> Unit,
    text: String,
    color: Color = Green

){
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(50.dp) ,
        colors = ButtonDefaults.buttonColors(
            containerColor = color
        ),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)

    ) {
        Text(text = text, color = White, style = MaterialTheme.typography.bodyLarge )
    }
}
@Composable
fun ButtonMinRounding(
    onClick:()-> Unit,
    text: String,
    color: Color = Green

){
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(50.dp) ,
        colors = ButtonDefaults.buttonColors(
            containerColor = color
        ),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)

    ) {
        Text(text = text, color = White, style = MaterialTheme.typography.bodyLarge )
    }

}

fun Modifier.customBackground(
    backgroundColor: Color = Grey1,
    cornerRadius: Dp = 8.dp
) = this
    .clip(RoundedCornerShape(cornerRadius))
    .background(backgroundColor)
