package com.github.gustavobarbosab.testapplication.presentation.main.fragment

interface MainContract {
    interface View {
        fun loadList(items: List<String>)
        fun showError()
    }

    interface Presenter {
        fun startRequest()
        fun onDestroy()
    }
}