package com.workspace;

public class SearchInMountain {
    public static void main(String[] args) {
        int target = 2;
        int[] mountainArr = new int[]{1,5,2};
        System.out.println(target + " exists at " + findInMountainArray(target, mountainArr));
    }
    public static int findInMountainArray(int target, int[] mountainArr){
        int start = 0;
        int end = mountainArr.length - 1;
        int mid;
        while(start < end){
            mid = start + ((end - start)/2);
            if(mountainArr[mid] > mountainArr[mid + 1]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        int ans = binarySearch(mountainArr, target, 0, start);
        if(ans == -1){
            ans = binarySearch(mountainArr, target, start + 1, mountainArr.length - 1);
        }
        return ans;
    }
    public static int binarySearch(int[] array, int target, int s, int e){
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
