package com.workspace;

public class StrictlySortedMatrix {
    public static void main(String[] args) {
        int[][] matrix= {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120},
                {130, 140, 150, 160}
        };
        int[] ans = search(matrix, 25);
        System.out.println("Target element exists at row:" + ans[0] + " and column:" + ans[1]);
    }
    static int[] search(int[][] matrix, int target){

        return new int[]{-1,-1};
    }
}
