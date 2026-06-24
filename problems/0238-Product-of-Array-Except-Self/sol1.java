// ==========================================================
// 238. Product of Array Except Self
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms
// Memory     : 42.8 MB
// Link       : https://leetcode.com/problems/product-of-array-except-self/
// ==========================================================

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul=1;
        for(int i=0;i<nums.length;i++){
            mul*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]^mul;
        }
    }
        return nums;
}