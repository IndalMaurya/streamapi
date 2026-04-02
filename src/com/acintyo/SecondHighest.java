package com.acintyo;

public class SecondHighest {
    public static void main(String[] args) {
        int arr[] = {10, 20, 4, 45, 99, 99, 105};

        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                smax = max;
                max = arr[i];
            } else if (arr[i] > smax && arr[i] < max) {
                smax = arr[i];
            }
        }

        if (smax == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Max = " + max);
            System.out.println("Smax = " + smax);
        }
    }
}
