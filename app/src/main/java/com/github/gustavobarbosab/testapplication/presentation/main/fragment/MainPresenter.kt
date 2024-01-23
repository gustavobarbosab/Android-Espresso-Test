package com.github.gustavobarbosab.testapplication.presentation.main.fragment

import com.github.gustavobarbosab.testapplication.data.MyRepository
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.schedulers.Schedulers

class MainPresenter(
    private var view: MainContract.View?,
    private val repository: MyRepository
) : MainContract.Presenter {

    private val compositeDisposable = CompositeDisposable()

    override fun startRequest() {
        repository.getMockExample()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnError(this::onError)
            .subscribe(this::onSuccess)
            .also(compositeDisposable::add)
    }

    private fun onSuccess(response: List<String>) {
        view?.loadList(response)
    }

    private fun onError(throwable: Throwable) {
        view?.showError()
    }

    override fun onDestroy() {
        view = null
        compositeDisposable.dispose()
    }
}