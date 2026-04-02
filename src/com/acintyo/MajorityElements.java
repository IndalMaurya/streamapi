package com.acintyo;

import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 4, 2, 3, 3, 3, 4 };
        int size = arr.length;
        int n = size / 2;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency Map: " + map);

        boolean found = false;  // flag

        for (int num : map.keySet()) {
            if (map.get(num) > n) {
                System.out.println("Majority Element: " + num + " = " + map.get(num));
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Majority Element found");
        }
    }
}
