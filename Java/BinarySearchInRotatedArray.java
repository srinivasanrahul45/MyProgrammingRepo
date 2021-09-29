package com.workspace;

// https://leetcode.com/problems/search-in-rotated-sorted-array/

public class BinarySearchInRotatedArray {
    public static void main(String[] args) {
        int[] array = {2,5,6,0,0,1,2};
        int target = 1;
        System.out.println(target + " exist at " + search(array, target));
    }
    static public int search(int[] nums, int target) {
        // int pv = findPivot(nums);
        int pv = findPivotWithDuplicates(nums);
        int ans = -1;
        if(pv == -1){
            // Array is not rotated
            return binarySearch(nums, target, 0, nums.length - 1);
        } else if(nums[pv] == target){
            return pv;
        }
        if(nums[0] <= target){
            ans = binarySearch(nums, target, 0, pv - 1);
        } else if(nums[0] >= target){
            ans = binarySearch(nums, target, pv + 1, nums.length - 1);
        }
        return ans;
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
    static int binarySearch(int[] array, int target, int s, int e) {
        while (s <= e) {
            // Better way to find mid-point
            int m = s + ((e - s) / 2);

            if (target < array[m]) {
                e = m - 1;
            } else if (target > array[m]){
                s = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
    static int findPivotWithDuplicates(int[] array){
        int s = 0;
        int e = array.length - 1;
        while(s <= e){
            int m = s + ((e - s) / 2);
            if(m < e && array[m] > array[m + 1]){
                return m;
            } else if(m > s && array[m] < array[m - 1]){
                return m - 1;
            } else if(array[m] <= array[s]){
                e = m - 1;
            }
            if(array[s] == array[m] && array[e] == array[m]) {
                // Skip duplicate elements if not pivot
                if (array[s] > array[s + 1]) {
                    return s;
                }
                s++;
                if (array[e] < array[e - 1]) {
                    return e;
                }
                e++;
            } else if(array[s] < array[m] || (array[s] == array[m] && array[m] > array[e])){
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
}
