package ru.myproject.jobsearch.viewModels

import androidx.lifecycle.ViewModel
import ru.myproject.domain.Repository
import javax.inject.Inject

class SearchViewModel @Inject constructor(
    private val repository: ru.myproject.domain.Repository

): ViewModel() {

}
