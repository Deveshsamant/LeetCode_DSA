// ==========================================================
// 49. Group Anagrams
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 893 ms (Beats 5%)
// Memory     : 49.7 MB (Beats 46%)
// Link       : https://leetcode.com/problems/group-anagrams/
// ==========================================================

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> aa = new ArrayList<>();
        if(strs.length==1){
            List<String> tt=new ArrayList<>();
            tt.add(strs[0]);
            aa.add(tt);
            return aa;
        }
        List<String> check=new ArrayList<>();

        for(int i=0;i<strs.length-1;i++){
            if(check.contains(strs[i])){
                continue;