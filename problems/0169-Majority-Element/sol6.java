// ==========================================================
// 169. Majority Element
// Difficulty : Easy
// Language   : Java
// Solution   : #6
// Runtime    : 1 ms (Beats 100%)
// Memory     : 56 MB (Beats 7%)
// Link       : https://leetcode.com/problems/majority-element/
// ==========================================================

            }
            else if(nums[i]!=candidate && count==0){
                candidate=nums[i];
            }
            else{
                count--;
            }
        }
        return candidate;
    }
}