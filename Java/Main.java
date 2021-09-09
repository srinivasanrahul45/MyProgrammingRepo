package com.workspace;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] swap(int[] array, int p1, int p2){
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
        return array;
    }

    static int[] reverse(int[] array){
        int s = 0;
        int e = array.length - 1;
        while (s < e){
            swap(array, s, e);
            s++; e--;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arr;
        try (Scanner in = new Scanner(System.in)) {

            arr = new int[5];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
        }

        System.out.println("Reversed = " + Arrays.toString(reverse(arr)));
    }
}
