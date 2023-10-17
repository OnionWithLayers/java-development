package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //"try" tries to run the code, if it fails, it'll reroute to "catch"
        try {
            int[] num = {1, 4, 3};
            //this sout will be an error bc there's nothing in the array index "5"
            System.out.println(num[5]);

            //catches make sure your program doesn't crash
            //this catch is specific
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("An array-based error has occurred!");
            //always do a specific and then general catch if you put multiple
            //this catches all exceptions and reroutes it to whatever you typed in this
        } catch(Exception ex) {
            System.out.println("A general exception has occurred");
        }
    }
}