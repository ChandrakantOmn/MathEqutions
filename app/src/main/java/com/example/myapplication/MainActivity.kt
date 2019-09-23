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
        applicationContext.showToast(findTheMissingNumberUnsorted(list1))
    }

    private fun findTheMissingNumberUnsorted(list: List<Int>): String {
        return if (list.isNotEmpty()) {
            val n = list.size
            var total = (n + 1) * (n + 2) / 2
            for (i in list) {
                total -= i
            }
            total.toString()
        } else "Enter correct data"

    }

    private fun findTheMissingNumber(list: List<Int>): String {
        return if (list.isNotEmpty()) {
            var lastNum = 0
            var missingNumber = -1
            for (i in list) {
                if ((i - lastNum) > 1) {
                    missingNumber = lastNum + 1
                }
                lastNum = i
            }
            missingNumber.toString()
        } else "Enter correct data"
    }

    private fun getSecondHighestNumberFromList(list: List<Int>): String {
        return if (list.isNotEmpty()) {
            var max = list[0]
            var secondMax = list[0]
            for (i in list) {
                if (i > max) {
                    secondMax = max
                    max = i
                } else {
                    if (i > secondMax) {
                        secondMax = i
                    }
                }
            }
            secondMax.toString()
        } else "Enter correct data"

    }

    private fun getHighestNumberFromList(list: List<Int>): String {
        return if (list.isNotEmpty()) {
            var max = list[0]
            for (i in list) {
                if (i > max)
                    max = i
            }
            max.toString()
        } else "Enter correct data"
    }


}

private fun Context.showToast(s: String) {
    Toast.makeText(this, s, Toast.LENGTH_LONG).show()
}
