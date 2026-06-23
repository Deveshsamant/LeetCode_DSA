// ==========================================================
// 1. Two Sum
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 56%)
// Memory     : 47.1 MB (Beats 58%)
// Link       : https://leetcode.com/problems/two-sum/
// ==========================================================

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> aa=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(aa.containsKey(x)){
                return new int[]{i,aa.get(x)};
            }
            else{
                aa.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }