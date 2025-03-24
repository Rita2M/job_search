package ru.myproject.jobsearch.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ru.myproject.jobsearch.R

val SFProDisplay = FontFamily(
    Font(R.font.sf_pro_display_regular, FontWeight.Normal),
    Font(R.font.sf_pro_display_medium, FontWeight.Medium),
    Font(R.font.sf_pro_display_semibold, FontWeight.SemiBold)
)

// Определение стилей типографики
val Typography = Typography(
    titleLarge = TextStyle( //title 1
        fontFamily = SFProDisplay,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp
    ),
    titleMedium = TextStyle( //title 2
        fontFamily = SFProDisplay,
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp
    ),
    titleSmall = TextStyle( //Title 3
        fontFamily = SFProDisplay,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),
    headlineSmall = TextStyle( //Title 4
        fontFamily = SFProDisplay,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(  //Button text 2
        fontFamily = SFProDisplay,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    labelLarge = TextStyle( //Button text 1
        fontFamily = SFProDisplay,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),
    labelMedium = TextStyle( //Text 1
        fontFamily = SFProDisplay,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    labelSmall = TextStyle( //Tab text
        fontFamily = SFProDisplay,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp
    ),
    bodySmall = TextStyle( //Number
        fontFamily = SFProDisplay,
        fontWeight = FontWeight.Normal,
        fontSize = 7.sp
    )
)
