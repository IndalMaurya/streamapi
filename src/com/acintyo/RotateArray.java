package com.acintyo;

public class RotateArray {

    // Function to reverse part of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate array by k steps
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handle cases where k > n

        // Step 1: Reverse the whole array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining n-k elements
        reverse(arr, k, n - 1);
    }

    // Test
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rotate(arr, k);

        System.out.print("Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
