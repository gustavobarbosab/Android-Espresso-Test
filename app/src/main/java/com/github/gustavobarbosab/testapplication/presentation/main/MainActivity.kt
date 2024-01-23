package com.github.gustavobarbosab.testapplication.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.gustavobarbosab.testapplication.R
import com.github.gustavobarbosab.testapplication.presentation.main.fragment.MainContract

class MainActivity : AppCompatActivity(), MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}