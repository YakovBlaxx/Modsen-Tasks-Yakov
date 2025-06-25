package com.example.modsentasksyakov.domain.repository

import com.example.modsentasksyakov.domain.model.TaskDomainModel

interface ITaskRepository {
    suspend fun getTasks(): List<TaskDomainModel>
}