// ==========================================================
// 75. Sort Colors
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.6 MB (Beats 42%)
// Link       : https://leetcode.com/problems/sort-colors/
// ==========================================================

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {