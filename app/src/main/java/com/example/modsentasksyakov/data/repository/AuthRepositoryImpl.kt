package com.example.modsentasksyakov.data.repository

import com.example.modsentasksyakov.data.model.AuthDataModel
import kotlinx.coroutines.delay

class AuthRepositoryImpl {
    private val validCredentials = listOf(
        AuthDataModel("admin", "1234"),
        AuthDataModel("user", "pass")
    )

    suspend fun login(credentials: AuthDataModel): Boolean {
        delay(1000)
        if (validCredentials.contains(credentials)) {
            return true
        } else {
            throw Exception("Неверный логин или пароль")
        }
    }
}