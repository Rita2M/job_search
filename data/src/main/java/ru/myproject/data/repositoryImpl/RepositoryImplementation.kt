package ru.myproject.data.repositoryImpl

import kotlinx.coroutines.flow.Flow
import ru.myproject.data.retrofit.ApiService
import ru.myproject.data.retrofit.Offer
import ru.myproject.data.retrofit.ResponseDataDto

import ru.myproject.domain.Repository
import javax.inject.Inject
import javax.inject.Singleton


class RepositoryImplementation @Inject constructor(
    private val apiService: ApiService
): Repository {




    override suspend fun getData(): ResponseDataDto {
        return apiService.getData().body()
    }
}
