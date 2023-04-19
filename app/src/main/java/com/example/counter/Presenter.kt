package com.example.counter

import android.graphics.Color

class Presenter {

    var model = Injector.fillModel()
    lateinit var view: CounterView

    fun increment() {
        model.increment()
        view.showCount(model.count.toString())
        if (model.count == 10) {
            view.showToast()
        }
        if (model.count == 15) {
            view.changerColor(Color.GREEN)
        } else {
            view.changerColor(Color.BLACK)
        }
    }

    fun decrement() {
        model.decrement()
        view.showCount(model.count.toString())
        if (model.count == 10) {
            view.showToast()
        }
        if (model.count == 15) {
            view.changerColor(Color.GREEN)
        } else {
            view.changerColor(Color.BLACK)
        }
    }

    fun attachView(view: CounterView) {
        this.view = view
    }
}