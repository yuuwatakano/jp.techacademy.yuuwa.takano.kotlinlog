package jp.techacademy.yuuwa.takano.jptechacademyyuuwatakanokotlinlog

import android.util.Log
 class Human:Animal,Thinkable{
    var hobby:String
    constructor(name: String,hobby:String,age: Int): super(name,age) {
        this.hobby=hobby
    }
    fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は"+this.age+"歳です。")
    }
    override fun think(){
        Log.d("kotlintest","私は"+this.hobby+"について考える。")
    }
}
