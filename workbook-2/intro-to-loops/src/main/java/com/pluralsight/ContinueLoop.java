package com.pluralsight;

public class ContinueLoop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 != 0) { // no need for continue
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
