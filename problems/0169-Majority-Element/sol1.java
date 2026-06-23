// ==========================================================
// 169. Majority Element
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 6 ms (Beats 49%)
// Memory     : 55.5 MB (Beats 60%)
// Link       : https://leetcode.com/problems/majority-element/
// ==========================================================

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];

    }
}