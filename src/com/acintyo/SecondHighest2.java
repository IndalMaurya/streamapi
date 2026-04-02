package com.acintyo;

import java.util.Arrays;

public class SecondHighest2 {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 4, 45, 99, 99, 105 };
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }

        if (smax == Integer.MIN_VALUE) {
            System.out.println("No second highest value found");
        } else {
            System.out.println("Max = " + max);
            System.out.println("Second Max = " + smax);
        }
        
        System.out.println("--------------------------------------");
        
        Integer max1 = Arrays.stream(arr).distinct().boxed().sorted((a,b)-> b-a).findFirst().orElse(null);
        
        System.out.println("Max = "+max1);
        
         Integer secondMax = Arrays.stream(arr).distinct().boxed().sorted((a,b)-> b-a)
         .skip(1).findFirst().orElse(null);
         
         if (secondMax == null) {
             System.out.println("No second highest value found");
         } else {
             System.out.println("Second Max = " + secondMax);
         }
    }
}
