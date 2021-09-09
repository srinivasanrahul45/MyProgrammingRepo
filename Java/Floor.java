package com.workspace;

public class Floor {
    public static void main(String[] args) {
        int[] sortedArray = new int[]{-10, -6, -3, -2, 0, 3, 5, 7, 10, 64, 98};
        int target = 4;

        System.out.println(sortedArray[findFloor(sortedArray, target)]);
    }
    static int findFloor(int[] array, int target) {
        int s = 0;
        int e = array.length - 1;

        // If target is less than elements in array
        if(target < array[0]){
            return -1;
        }

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
        return e;
    }
}