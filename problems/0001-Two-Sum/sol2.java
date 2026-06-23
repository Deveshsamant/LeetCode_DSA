// ==========================================================
// 1. Two Sum
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 3 ms (Beats 56%)
// Memory     : 47.2 MB (Beats 40%)
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