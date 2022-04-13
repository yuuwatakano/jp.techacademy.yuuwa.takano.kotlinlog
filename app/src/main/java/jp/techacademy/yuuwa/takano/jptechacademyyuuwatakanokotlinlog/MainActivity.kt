package jp.techacademy.yuuwa.takano.jptechacademyyuuwatakanokotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Objects.toString

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val human = Human("高野","虫",22)     // 名前を高野です。年は22歳です。
            human.say()
            human.think()

            val human2 = Human("ゆうわ","ご飯",24)
            human2.say()
            human2.think()
    }
}