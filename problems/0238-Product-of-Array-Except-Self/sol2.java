// ==========================================================
// 238. Product of Array Except Self
// Difficulty : Medium
// Language   : Java
// Solution   : #2
// Runtime    : 2 ms (Beats 95%)
// Memory     : 71.5 MB (Beats 62%)
// Link       : https://leetcode.com/problems/product-of-array-except-self/
// ==========================================================

    res[0] = 1;
    for (int i = 1; i < n; i++) res[i] = res[i-1] * nums[i-1];

    int suffix = 1;
    for (int i = n - 1; i >= 0; i--) {
        res[i] *= suffix;
        suffix *= nums[i];
    }
    return res;
    int[] res = new int[n];
    int n = nums.length;
    public int[] productExceptSelf(int[] nums) {
    }
class Solution {