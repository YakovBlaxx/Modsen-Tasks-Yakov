package com.example.modsentasksyakov.data.mappers


import com.example.modsentasksyakov.data.model.AuthDataModel
import com.example.modsentasksyakov.domain.model.AuthDomainModel

fun AuthDataModel.toDataModel(): AuthDomainModel {
    return AuthDomainModel(
        login = this.login,
        password = this.password
    )
}