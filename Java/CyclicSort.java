package com.workspace;

import java.util.Arrays;

// Works for 1 to N only

public class CyclicSort {
    public static void main(String[] args) {
        int[] sorted = new int[]{4,3,2,7,8,2,3,1};
        cyclicSort(sorted);
        System.out.println("Sorted Array is " + Arrays.toString(sorted));
    }
    static void cyclicSort(int[] array){
        int i = 0;
        while (i < array.length) {
            int correct = array[i] - 1;
            if (array[i] != array[correct]) { // Handles duplicate elements as well
                swap(array, i , correct);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] array, int pos1, int pos2){
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
