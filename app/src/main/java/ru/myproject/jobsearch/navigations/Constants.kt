package ru.myproject.jobsearch.navigations

sealed class MainScreenConstants(
    val route: String
) {
    data object Search : MainScreenConstants("search")
    data object Favourites : MainScreenConstants("favourites")
    data object Responses: MainScreenConstants("responses")
    data object Messages: MainScreenConstants("messages")
    data object Profile: MainScreenConstants("profile")

}
