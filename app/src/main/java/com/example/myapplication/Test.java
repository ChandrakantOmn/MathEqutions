package com.example.myapplication;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Chandra Kant on 23/9/19.
 */
public class Test {
    @NotNull
    public static String isPalindrome(@NotNull char[] toCharArray) {
        String reverseString="";
        for(int i=toCharArray.length;i>0; i--){
            reverseString = reverseString+ toCharArray[i];
        }

        return reverseString;
    }
}
