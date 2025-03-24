package ru.myproject.jobsearch.screen.search

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import ru.myproject.domain.Offers
import ru.myproject.jobsearch.R
import ru.myproject.jobsearch.ui.common.customBackground

import ru.myproject.jobsearch.ui.theme.Grey22
import ru.myproject.jobsearch.viewModels.SearchViewModel

@Composable
fun SearchScreen(
    viewModel: SearchViewModel
) {
    Column(modifier = Modifier.fillMaxSize()) {
        HardcoreElement()
      //  RecommendationBlock(offers = )

    }

}
@Composable
fun RecommendationBlock(offers: List<Offers>){
    LazyRow {
        items(offers, key = {it.id})
         { offer ->
            CardRecommend(
                id = offer.id,
                title = offer.title,
                buttonText = offer.buttonText
            )
        }
    }
}

@Composable
fun HardcoreElement() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        // Первый элемент (занимает 7 частей)
        Row(
            modifier = Modifier
                .weight(7f)
                .customBackground(backgroundColor = Grey22)
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = "search"
            )
            TextField(
                value = "",
                onValueChange = {},
                readOnly = true,
                label = { Text(stringResource(id = R.string.input_prompt)) }
            )
        }


        Icon(
            painter = painterResource(id = R.drawable.ic_filter),
            contentDescription = "filter",
            modifier = Modifier
                .weight(1f)
                .customBackground(backgroundColor = Grey22)
        )
    }
}
@Preview
@Composable
fun PreviewScreen(){

}
