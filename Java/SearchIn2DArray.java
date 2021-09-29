package com.workspace;

// This code only works for Row-wise and Column-wise sorted matrix

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] matrix= {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {24, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int[] ans = search(matrix, 25);
        System.out.println("Target element exists at row:" + ans[0] + " and column:" + ans[1]);
    }
    static int[] search(int[][] matrix, int target){
        int row = 0;
        int col = matrix.length - 1;
        while(col >= 0 && row < matrix.length){
            if(target == matrix[row][col]){
                return new int[]{row, col};
            } else if(matrix[row][col] < target){
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
