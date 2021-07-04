package io.github.turskyi.parcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import io.github.turskyi.parcelable.domain.MyObject

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("===>>>", "getParcelableExtra")
        val myObj = intent.getParcelableExtra<Parcelable>(
            MyObject::class.java.canonicalName) as MyObject?
        Log.d("===>>>", "myObj: " + myObj!!.s + ", " + myObj.i)
    }
}