package com.workspace;

// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class RotationCountInRotatedArray {
    public static void main(String[] args) {
        int[] array = {7, 9, 11, 12, 15};
        int numRotations = findPivot(array) + 1;
        System.out.println("Number of rotations is " + numRotations);
    }
    static int findPivot(int[] array){
        int s = 0;
        int e = array.length - 1;
        while(s <= e){
            int m = s + ((e - s) / 2);
            // Pivot will satisfy any of the below four cases (without changing time complexity)
            if(m < e && array[m] > array[m + 1]){
                return m;
            } else if(m > s && array[m] < array[m - 1]){
                return m - 1;
            } else if(array[m] <= array[s]){
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }
}
