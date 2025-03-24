package ru.myproject.jobsearch.screen.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import ru.myproject.jobsearch.R
import ru.myproject.jobsearch.ui.common.customBackground
import ru.myproject.jobsearch.ui.theme.Green

@Composable
fun CardRecommend(
    id: String?,
    title: String,
    buttonText: String?
) {
    Column(
        modifier = Modifier
            .customBackground()
            .padding(8.dp)
    ) {
        // Иконка (если id присутствует в iconMap)
        iconMap[id]?.let { iconId ->
            Icon(
                painter = painterResource(id = iconId),
                contentDescription = "icon",
                modifier = Modifier.size(24.dp)
            )
        }

        // Заголовок с ограничением строк
        Text(
            text = title,
            maxLines = if (buttonText == null) 3 else 2,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.headlineSmall
        )


        buttonText?.let {
            Text(
                text = it,
                color = Green,
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}
val iconMap = mapOf(
    "near_vacancies" to R.drawable.ic_near_vacancies,
    "level_up_resume" to R.drawable.ic_level_up_resume,
    "temporary_job" to R.drawable.ic_temporary_job
)
