package ru.myproject.jobsearch.scaffoldBars

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import ru.myproject.jobsearch.R
import ru.myproject.jobsearch.navigations.MainScreenConstants
import ru.myproject.jobsearch.ui.theme.Blue
import ru.myproject.jobsearch.ui.theme.Grey4

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomBarApp(
    navController : NavHostController,
    countFavourites : Int
){
BottomAppBar(
    modifier = Modifier.fillMaxWidth()
){
    NavigationBar {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        BottomNavConstants.items.forEach{item ->
            val color = if(item.route ==currentRoute) Blue else Grey4
            NavigationBarItem(
                selected = currentRoute == item.route,
                onClick = { /* TODO */ },
                icon = {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        BadgedBox(badge = { if (countFavourites > 0 && item.route == "favourites") Badge { Text(text = countFavourites.toString()) } }) {
                            Icon(
                                painter = painterResource(item.iconId),
                                contentDescription = stringResource(id = item.titleResId),
                                tint = color
                            )
                        }
                        Text(
                            text = stringResource(id = item.titleResId),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            fontSize = 12.sp,
                            softWrap = false,
                            color = color
                        )
                    }
                }
            )

        }

    }

}
}
@Composable
fun BottomItems(
    item: BottomNavItem
){
   
}
object BottomNavConstants{
    val items = listOf(
        BottomNavItem( R.string.title_search, R.drawable.ic_search,MainScreenConstants.Search.route),
        BottomNavItem(R.string.title_favourites,R.drawable.ic_favourites,MainScreenConstants.Favourites.route),
        BottomNavItem(R.string.title_responses,R.drawable.ic_response,MainScreenConstants.Responses.route),
        BottomNavItem(R.string.title_messages,R.drawable.ic_messages,MainScreenConstants.Messages.route),
        BottomNavItem(R.string.title_profile,R.drawable.ic_profile,MainScreenConstants.Profile.route)

    )
}
data class BottomNavItem(val titleResId: Int, val iconId:Int, val route: String)
