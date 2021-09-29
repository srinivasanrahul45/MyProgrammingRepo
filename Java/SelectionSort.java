package com.workspace;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{-9192, 2967};
        int[] sorted = new int[]{1, 2, 3, 4, 5, 6};
        selectionSort(array);
        selectionSort(sorted);
        System.out.println("Sorted Array is " + Arrays.toString(sorted));
        System.out.println("Sorted Array is " + Arrays.toString(array));
    }
    static void selectionSort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int last = array.length - 1 - i;
            int maxIndex = getMaxIndex(array, last);
            int temp = array[maxIndex];
            array[maxIndex] = array[last];
            array[last] = temp;
        }
    }

    private static int getMaxIndex(int[] array, int last) {
        int maxIndex = 0;
        for (int j = 0; j <= last; j++) {
            if(array[maxIndex] < array[j]){
                maxIndex = j;
            }
        }
        return maxIndex;
    }
}
