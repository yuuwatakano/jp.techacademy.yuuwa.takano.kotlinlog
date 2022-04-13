package jp.techacademy.yuuwa.takano.jptechacademyyuuwatakanokotlinlog

import android.util.Log

open class Dog: Animal {
    // 引数付きコンストラクタ
    constructor(name: String, age: Int) : super(name, age) {
    }
    open fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
    }
