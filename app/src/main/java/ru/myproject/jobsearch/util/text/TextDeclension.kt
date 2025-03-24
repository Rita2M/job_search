package ru.myproject.jobsearch.util.text

fun getVacancyWord(count: Int): String {
    return when {
        count % 100 in 11..19 -> "вакансий"
        count % 10 == 1 -> "вакансия"
        count % 10 in 2..4 -> "вакансии"
        else -> "вакансий"
    }
}
