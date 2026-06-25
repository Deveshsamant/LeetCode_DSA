// ==========================================================
// 238. Product of Array Except Self
// Difficulty : Medium
// Language   : Java
// Solution   : #4
// Runtime    : 2 ms (Beats 95%)
// Memory     : 72.1 MB (Beats 27%)
// Link       : https://leetcode.com/problems/product-of-array-except-self/
// ==========================================================

class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    res[0] = 1;
    for (int i = 1; i < n; i++) {
        res[i] = res[i-1] * nums[i-1];
    }

    int suffix = 1;
    for (int i = n - 1; i >= 0; i--) {
        res[i] *= suffix;
        suffix *= nums[i];
    }