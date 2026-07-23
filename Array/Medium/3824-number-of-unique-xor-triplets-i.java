// ═══════════════════════════════════════════════════════
// Problem: 3824. Number of Unique XOR Triplets I
// Difficulty: Medium
// Topics: Array, Math, Bit Manipulation
// Runtime: 1 ms (Beats 51.0%)
// Memory: 125.6 MB (Beats 10.2%)
// Submitted: Jul 23, 2026
// Link: https://leetcode.com/problems/number-of-unique-xor-triplets-i/
// ═══════════════════════════════════════════════════════

class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;

        if (n <= 2) return n;

        int mask = 0;
        for (int num : nums) {
            mask |= num;
        }

        return mask + 1;
    }
}
