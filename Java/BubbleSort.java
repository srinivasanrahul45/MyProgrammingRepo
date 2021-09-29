package com.workspace;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{91,90,87,76,59,92};
        int[] sorted = new int[]{1, 2, 3, 4, 5, 6};
        bubbleSort(array);
        bubbleSort(sorted);
        System.out.println("Sorted Array is " + Arrays.toString(sorted));
        System.out.println("Sorted Array is " + Arrays.toString(array));
    }
    static void bubbleSort(int[] array){
        boolean swap;
        for (int i = 0; i < array.length; i++) {
            swap = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]){
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swap = true;
                }
                if (!swap){
                    break;
                }
            }
        }
    }
}
