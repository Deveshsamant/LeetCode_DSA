// ==========================================================
// 287. Find the Duplicate Number
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 92%)
// Memory     : 83.2 MB (Beats 27%)
// Link       : https://leetcode.com/problems/find-the-duplicate-number/
// ==========================================================

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
       while (slow != fast) {
        int fast = nums[0];
         while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }
        slow=nums[0];