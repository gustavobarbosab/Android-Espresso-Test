package com.github.gustavobarbosab.testapplication.presentation.main.di

import com.github.gustavobarbosab.testapplication.presentation.main.fragment.MainContract
import com.github.gustavobarbosab.testapplication.presentation.main.fragment.MainFragment
import com.github.gustavobarbosab.testapplication.presentation.main.fragment.MainPresenter
import com.github.gustavobarbosab.testapplication.data.MyService
import com.github.gustavobarbosab.testapplication.data.MyRepository
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.bind
import org.koin.dsl.module
import retrofit2.Retrofit

object MainModule {
    val instance = module {
        scope<MainFragment> {
            factory { get<Retrofit>().create(MyService::class.java) }
            factoryOf(::MyRepository)
            factoryOf(::MainPresenter) bind MainContract.Presenter::class
        }
    }
}