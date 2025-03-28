package ru.myproject.domain

data class Vacancy(
    val id: String,
    val lookingNumber: Int? = null,
    val title: String,
    val address: Address,
    val company: String,
    val experience: Experience,
    val publishedDate: String,
    val isFavorite: Boolean,
    val salary: Salary,
    val schedules: List<String>,
    val appliedNumber: Int? = null,
    val description: String,
    val responsibilities: String,
    val questions: List<String>
)
data class Address(
    val town: String,
    val street: String,
    val house: String
)
data class Experience(
    val previewText: String,
    val text: String
)

data class Salary(
    val short: String? = null,
    val full: String
)

data class ResponseData(
    val offers: List<Offer>,
    val vacancies: List<Vacancy>
)
