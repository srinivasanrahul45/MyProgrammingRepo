package com.workspace;

// Question Link - https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class positionOfElementInInfiniteArray {
    public static void main(String[] args) {
        int[] array = new int[]{-10, -6, -3, -2, 0, 3, 5, 7, 10, 64, 98, 105, 118, 121, 139, 143, 159, 164, 171}; // Consider as infinite array
        int target = 10;
        System.out.println(target + " found at index " + findElement(array, target));
    }
    public static int findElement(int[] array, int target){
        int s = 0;
        int e = 1;
        int l;
        while (target > array[e]){
            l = (e - s) + 1;
            s = e + 1;
            e = e + (l * 2);
        }
        return binarySearch(array, target, s, e);
    }
    public static int binarySearch(int[] array, int target, int s, int e){
        while (s <= e) {
            // Better way to find mid-point
            int m = s + ((e - s) / 2);

            if (target < array[m]) {
                e = m - 1;
            } else if (target > array[m]){
                s = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}