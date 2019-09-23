package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        val list = listOf(10, 12, 5, 13, 66, 83, 72, 18, 44, 34, 90)
        val list1 = listOf(1, 2, 3, 4, 6, 7, 8)
        applicationContext.showToast(MathUtil.findTheMissingNumberUnsorted(list1))
    }
}

private fun Context.showToast(s: String) {
    Toast.makeText(this, s, Toast.LENGTH_LONG).show()
}
