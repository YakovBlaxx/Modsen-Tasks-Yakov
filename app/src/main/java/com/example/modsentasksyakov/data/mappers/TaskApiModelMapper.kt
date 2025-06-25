package com.example.modsentasksyakov.data.mappers

import com.example.modsentasksyakov.data.model.TaskDataModel
import com.example.modsentasksyakov.domain.model.TaskDomainModel

fun TaskDataModel.toDomainModel(): TaskDomainModel {
    return TaskDomainModel(
        id = this.id,
        title = this.title,
        description = this.description
    )
}