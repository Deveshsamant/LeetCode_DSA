// ==========================================================
// 14. Longest Common Prefix
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 8 ms (Beats 5%)
// Memory     : 46.4 MB (Beats 5%)
// Link       : https://leetcode.com/problems/longest-common-prefix/
// ==========================================================

        if(mm.isEmpty()){
            return "";
        }
        return mm;
    }

    public String comm(String str1, String str2){
        int l1=str1.length();
        int l2=str2.length();
        int l3=Math.min(l1,l2);
        String s1="";
        for(int i=0;i<l3;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                s1 += str1.charAt(i);
            }