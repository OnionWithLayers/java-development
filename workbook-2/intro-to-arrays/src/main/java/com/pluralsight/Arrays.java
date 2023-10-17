package com.pluralsight;

public class Arrays {
    public static void main(String[] args) {
        // [] there are multiple values, you CANT put multiple values if there are no []
        int[] numbers = {123, 234, 345, 4232, 111};
        String[] names = {"Jake", "Finn", "BMO"};

        System.out.println(numbers[3]);
//        System.out.println(names[2]);

        int[] listOfNumbers = new int[3];
        listOfNumbers[0] = 123;
        listOfNumbers[1] = 14;
        listOfNumbers[2] = 43;

//        System.out.println(names[0]);
//        System.out.println(names[2]);
//        System.out.println(names[1]);
//      arrays start at "0", but ".length", will tell you how many elements you have inside the array
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //sorts in alphabetical order
        java.util.Arrays.sort(names);

        //  (type elements : arrayName){
        //       code }
        for (String name : names) {
            System.out.println(name);
        }


//        public static void displayANumber(int number){
//            System.out.println(number);
//        }
//
//        public static void displayNumbers(int[] numbers){
//            for (int i = 0; i < numbers.length; i++) {
//                System.out.println(numbers[i]);
//            }
//            for(int number : numbers) {
//                System.out.println(number);
//            }
//        }


    }
}
