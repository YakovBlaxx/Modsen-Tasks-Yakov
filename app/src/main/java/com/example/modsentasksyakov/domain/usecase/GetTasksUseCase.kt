package com.example.modsentasksyakov.domain.usecase

import com.example.modsentasksyakov.data.model.TaskDataModel
import com.example.modsentasksyakov.data.repository.TaskRepositoryImpl

class GetTasksUseCase(private val taskRepository: TaskRepositoryImpl) {
    suspend operator fun invoke(): List<TaskDataModel> {
        return taskRepository.getTasks()
    }
}