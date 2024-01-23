package com.github.gustavobarbosab.testapplication.data

class MyRepository(private val service: MyService) {

    fun getMockExample() = service.getMockExample()
}