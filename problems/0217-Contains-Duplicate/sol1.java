// ==========================================================
// 217. Contains Duplicate
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 15 ms (Beats 62%)
// Memory     : 93.1 MB (Beats 72%)
// Link       : https://leetcode.com/problems/contains-duplicate/
// ==========================================================

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ans=new HashSet<>();
        int ilk=0;
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