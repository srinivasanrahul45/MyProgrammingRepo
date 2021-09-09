package com.workspace;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] ascendingArray = new int[]{-10, -6, -3, -2, 0, 3, 5, 7, 10, 64, 98};
        int[] descendingArray = new int[]{652, 579, 423, 322, 210, 165, 99, 50, 30, -1, -2, -100};
        int target1 = -14;
        int target2 = 100;

        System.out.println(orderAgnosticBinarySearch(ascendingArray, target1));
        System.out.println(orderAgnosticBinarySearch(descendingArray, target2));
    }
    static int orderAgnosticBinarySearch(int[] array, int target){
        int s = 0;
        int e = array.length - 1;

        boolean isAscending = array[s] < array[e];

        while (s <= e) {
            // Better way to find mid-point
            int m = s + ((e - s) / 2);

            if(array[m] == target){
                return m;
            }

            if (isAscending) {
                if (target < array[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (target > array[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return -1;
    }
}
