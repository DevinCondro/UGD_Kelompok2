package com.example.ugd.api

class PenggunaAPI {
    companion object{
        val BASE_URL = "https://ayopedulidonasi.my.id/api/"

        val GET_ALL_URL = BASE_URL + "pengguna/"
        val GET_BY_ID_URL = BASE_URL + "pengguna/"
        val ADD_URL = BASE_URL + "pengguna"
        val UPDATE_URL = BASE_URL + "pengguna/"
        val DELETE_URL = BASE_URL + "pengguna/"

        val REGISTER = BASE_URL + "register"
        val CHECK = BASE_URL + "check"

    }
}