package jp.techacademy.yuuwa.takano.jptechacademyyuuwatakanokotlinlog

import android.util.Log

open class Animal {
    // プロパティ
    var name: String
    var age: Int
    // 引数付きコンストラクタ
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}