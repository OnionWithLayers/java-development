package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        //for (initialization; condition; other)
        for (int i = 10; i >= 0; i--) {
            if (i > 0) {
                System.out.println(i);
                Thread.sleep(1000); //dont worry ab this yet. it just kinda
                                // pauses your program between each statement by 1 sec
            } else{
                System.out.println("Launch!");
            }
        }
    }
}