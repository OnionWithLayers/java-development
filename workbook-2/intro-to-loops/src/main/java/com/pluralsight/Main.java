package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        int i = 0;
/*      we make an int and set it to 0. Using that, we use "while" and set the condition
       to "as long as i < 5, print this statement out" and then put a "i++" at the end, to
       continually add 1 to i, until it reaches 5 and satisfies the condition
       thus, printing it out 5x
 */
        while (i < 5){
            System.out.println("Hello I am Daniel");
            i++;
        }
        //


        int a = 1;
        int sum = 0;

        while (a <= 10) {
            sum += a;   // 0 + 1 = 1, a=1 . a++ = 1+1=2
            a++;
        }
        System.out.println("Sum = " + sum);
            //
        while (i < 10){
            System.out.println(i);
            i++;
        }
            //

        //the do/while is difference than just a while loop. the do/while
        //will execute the code first before checking the condition
        int b = 1;
        int sumB = 0;
        do {
            sumB += b;
            b++;
        } while (b <= 10);
        System.out.println("Sum = " + sum);

    }
}
