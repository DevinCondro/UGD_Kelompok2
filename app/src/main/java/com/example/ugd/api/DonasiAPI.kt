package com.example.ugd.api

class DonasiAPI {
    companion object{
        val BASE_URL = "http://192.168.100.21/ugd_kelompok2/public/api/"

        val GET_ALL_URL = BASE_URL + "donasi/"
        val GET_BY_ID_URL = BASE_URL + "donasi/"
        val ADD_URL = BASE_URL + "donasi"
        val UPDATE_URL = BASE_URL + "donasi/"
        val DELETE_URL = BASE_URL + "donasi/"
    }
}