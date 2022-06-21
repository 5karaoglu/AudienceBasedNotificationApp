package com.besirkaraoglu.audiencebasednotificationapp

/***
 * This object is created to mock api operations.
 */
object FakeApi {
    private var token = ""

    fun getToken(): String {
        return token
    }

    fun setToken(token: String){
        this.token = token
    }
}