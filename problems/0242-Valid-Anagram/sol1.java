// ==========================================================
// 242. Valid Anagram
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 82%)
// Memory     : 46.7 MB (Beats 9%)
// Link       : https://leetcode.com/problems/valid-anagram/
// ==========================================================

    public boolean isAnagram(String s, String t) {
       char[] c1=s.toCharArray();
        char[] c2=t.toCharArray();
        Arrays.sort(c1);
        String a1 = new String(c1);
        Arrays.sort(c2);
        String a2 = new String(c2);

        
        return a1.equals(a2);

    }
}