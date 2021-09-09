package com.workspace;

// Start searching form first element till finding the element

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.print("Enter array elements >> ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter target element, start and end >> ");
        int t = in.nextInt();
        int s = in.nextInt();
        int e = in.nextInt();

        if (linearSearch(arr, t, s, e) == 1) {
            System.out.println(t + ", Exists in array");
        } else {
            System.out.println(t + ", Does not exist in array");
        }

        System.out.println("Minimum number in array is, " + minimumNumber(arr, s,e));
    }

    static int linearSearch(int[] array, int target, int start, int end){
        if (array.length == 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (array[i] == target){
                return 1;
            }
        }
        return -1;
    }
    public static int minimumNumber(int[] array, int start, int end){
        int min = array[0];
        for (int i = start; i <= end; i++) {
            if (min >= array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
