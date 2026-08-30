// ==========================================================
// 88. Merge Sorted Array
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.4 MB (Beats 98%)
// Link       : https://leetcode.com/problems/merge-sorted-array/
// ==========================================================



         while(n>=0){
            if(m>=0 && nums1[m]>=nums2[n]){
                int temp=nums1[m];
                nums1[m]=nums1[k];
                nums1[k]=temp;
                m--;
                k--;