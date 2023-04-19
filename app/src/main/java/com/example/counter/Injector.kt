package com.example.counter

class Injector {
    companion object{
        fun fillModel() = Model()
        fun fillPresenter() = Presenter()
    }
}