// ==========================================================
// 169. Majority Element
// Difficulty : Easy
// Language   : Java
// Solution   : #5
// Runtime    : 7 ms (Beats 44%)
// Memory     : 55.8 MB (Beats 31%)
// Link       : https://leetcode.com/problems/majority-element/
// ==========================================================

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];

    }
}