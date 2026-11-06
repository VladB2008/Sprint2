package com.example.net.storage

interface UserDataStorage {

    fun saveToken(token:String)

    fun getToken(): String
}