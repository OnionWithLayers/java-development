package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) {

//        for (initialization; condition; other) {
//            // code
//        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

  //      i % 2 == 0 //this is "i" divided by 2 has 0 remainders; meaning that it's an even #

        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                break;
            }
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
