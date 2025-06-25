package com.example.modsentasksyakov.data.repository

import com.example.modsentasksyakov.data.model.TaskDataModel
import kotlinx.coroutines.delay

class TaskRepositoryImpl {
    private val tasks = listOf(
        TaskDataModel(1, "Задание 1", "Реализовать авторизацию"),
        TaskDataModel(2, "Задание 2", "Добавить список задач")
    )

    suspend fun getTasks(): List<TaskDataModel> {
        delay(1000)
        return tasks
    }
}