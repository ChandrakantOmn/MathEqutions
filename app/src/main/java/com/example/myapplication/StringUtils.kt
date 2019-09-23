package com.example.myapplication

object StringUtils {
    fun isPalindrome(toCharArray: CharArray): Boolean {
        var reverseString = ""
        for (i in toCharArray.size downTo 1) {
            reverseString += toCharArray[i - 1]
        }
        println("reverseString:: $reverseString")
        return if (reverseString.equals(String(toCharArray), true)) return true else false
    }

}
