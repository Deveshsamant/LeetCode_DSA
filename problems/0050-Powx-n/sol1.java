// ==========================================================
// 50. Pow(x, n)
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 47.6 MB (Beats 78%)
// Link       : https://leetcode.com/problems/powx-n/
// ==========================================================

        if (n == 0) {
    private double fastPow(double x, long n) {
    }
            return 1;
        }
        double half = fastPow(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}