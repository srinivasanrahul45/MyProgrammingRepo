package com.workspace;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = new int[]{91,90,87,76,59,92};
        int[] sorted = new int[]{1, 2, 3, 4, 5, 6};
        insertionSort(array);
        insertionSort(sorted);
        System.out.println("Sorted Array is " + Arrays.toString(sorted));
        System.out.println("Sorted Array is " + Arrays.toString(array));
    }
    static void insertionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(array[j] < array[j-1]){
                    swap(array, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] array, int pos1, int pos2){
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
