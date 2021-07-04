package io.github.turskyi.parcelable

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.github.turskyi.parcelable.domain.MyObject


class MainActivity : AppCompatActivity() {

    /** Called when the activity is first created.  */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onclick(v: View?) {
        val myObj = MyObject("text", 1)
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(MyObject::class.java.canonicalName, myObj)
        Log.d("===>>>", "startActivity")
        startActivity(intent)
    }
}