package ru.myproject.jobsearch.navigations

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import ru.myproject.jobsearch.scaffoldBars.BottomBarApp
import ru.myproject.jobsearch.screen.favourites.FavouritesScreen
import ru.myproject.jobsearch.screen.messages.MessagesScreen
import ru.myproject.jobsearch.screen.profile.ProfileScreen
import ru.myproject.jobsearch.screen.responses.ResponsesScreen
import ru.myproject.jobsearch.screen.search.SearchScreen

@Composable
fun AppScaffold(

){
    val navController = rememberNavController()
    Scaffold (
        modifier = Modifier.fillMaxSize(),
        bottomBar ={ BottomBarApp(navController = navController,
            countFavourites = 4)}
    ){ padding->
        NavHost(modifier = Modifier.padding(padding),navController = navController, startDestination = MainScreenConstants.Search.route) {
            composable(MainScreenConstants.Search.route) { SearchScreen() }
            composable(MainScreenConstants.Favourites.route) { FavouritesScreen() }
            composable(MainScreenConstants.Responses.route) { ResponsesScreen() }
            composable(MainScreenConstants.Messages.route) { MessagesScreen() }
            composable(MainScreenConstants.Profile.route) { ProfileScreen() }
            
        }


    }
}
