// ==========================================================
// 169. Majority Element
// Difficulty : Easy
// Language   : Java
// Solution   : #3
// Runtime    : 7 ms (Beats 44%)
// Memory     : 55.9 MB (Beats 18%)
// Link       : https://leetcode.com/problems/majority-element/
// ==========================================================

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];

    }
}