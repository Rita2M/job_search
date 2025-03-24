package ru.myproject.domain

interface Repository {
   suspend fun getData(): ResponseData
}
