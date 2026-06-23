// 217. Contains Duplicate
// Difficulty: Easy
// https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ans=new HashSet<>();
        for(int i:nums){
            if(ans.contains(i)){
                return true;
            }
            else{
                ans.add(i);
            }
        }
        return false;
    }
}