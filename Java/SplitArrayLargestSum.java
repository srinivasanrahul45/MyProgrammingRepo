package com.workspace;

// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int numberOfSplits = 2;
        System.out.println(splitArray(array, numberOfSplits));
    }
    public static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while(start < end){
            int mid = start + ((end - start) / 2);

            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if(pieces > m){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
