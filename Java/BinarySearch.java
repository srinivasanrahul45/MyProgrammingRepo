package com.workspace;

/************************************************************************
* Binary Search -
 * Searching for element in a sorted array either ascending or descending
 * Steps:
 * 1. Find the middle element
 * 2. Check if target is greater than middle element and search accordingly
 * 3. If middle_element == target_element
 * 4. Done!
* ***********************************************************************/
public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = new int[]{-10, -6, -3, -2, 0, 3, 5, 7, 10, 64, 98};
        int target = 20;

        System.out.println(binarySearch(sortedArray, target));
    }
    static int binarySearch(int[] array, int target) {
        int s = 0;
        int e = array.length - 1;

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
