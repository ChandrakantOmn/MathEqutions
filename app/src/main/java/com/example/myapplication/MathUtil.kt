package com.example.myapplication

object MathUtil {
    @JvmStatic
    fun findTheMissingNumberUnsorted(list: List<Int>): String {
        return if (list.isNotEmpty()) {
            val n = list.size
            var total = (n + 1) * (n + 2) / 2
            for (i in list) {
                total -= i
            }
            total.toString()
        } else "Enter correct data"

    }

    @JvmStatic
    fun findTheMissingNumber(list: List<Int>): String {
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

    @JvmStatic
    fun getSecondHighestNumberFromList(list: List<Int>): String {
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

    @JvmStatic
    fun getHighestNumberFromList(list: List<Int>): String {
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

