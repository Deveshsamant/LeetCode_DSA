// ==========================================================
// 169. Majority Element
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 6 ms (Beats 49%)
// Memory     : 55.4 MB (Beats 69%)
// Link       : https://leetcode.com/problems/majority-element/
// ==========================================================

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];

    }
}