package com.pluralsight;

import java.util.Arrays;

public class replacing {
    public static void main(String[] args) {
        int originalPosition = 1;
        int newPosition = 4;
        int[] myArray = {23, 93, 56, 92, 39};
        int temp = myArray[originalPosition];
        myArray[originalPosition] = myArray[newPosition];
        myArray[newPosition] = temp;
        System.out.println(Arrays.toString(myArray));
    }
}

