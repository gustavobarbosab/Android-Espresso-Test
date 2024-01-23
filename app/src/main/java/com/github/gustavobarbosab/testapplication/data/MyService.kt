package com.github.gustavobarbosab.testapplication.data

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface MyService {

    @GET("/teste")
    fun getMockExample(): Single<List<String>>
}