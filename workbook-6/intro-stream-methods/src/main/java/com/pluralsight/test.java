package com.pluralsight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
       /* List<Integer> list = Arrays.asList(4, 4, 2, 4, 3, 3, 1, 4);

        ArrayList<Integer> ints = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++){
            if(i == 4){
                ints.add(i);
            }
        }
        int index = ints.lastIndexOf(4);
        System.out.println(index + 1);*/

        /*int[] arr = {0, 2, 3, 4, -5, -2, -1};
        int sum = 0;
        for(int list : arr){
            if (list > 0){
                sum += list;
                System.out.println(sum);
                break;
            } else {
                System.out.println(sum);
            }
        }*/



        ArrayList<Integer> products = new ArrayList<>();
        products.add(1);
        products.add(2);

        Integer som = products.get(0);
        System.out.println(som);
    }
}
