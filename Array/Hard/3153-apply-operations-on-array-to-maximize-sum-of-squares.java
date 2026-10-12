// ═══════════════════════════════════════════════════════
// Problem: 3153. Apply Operations on Array to Maximize Sum of Squares
// Difficulty: Hard
// Topics: Array, Hash Table, Greedy, Bit Manipulation
// Runtime: 64 ms (Beats 40.7%)
// Memory: 79.9 MB (Beats 100.0%)
// Submitted: Oct 12, 2026
// Link: https://leetcode.com/problems/apply-operations-on-array-to-maximize-sum-of-squares/
// ═══════════════════════════════════════════════════════

class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] b = new int[30];
        long ans = 0, mod = 1000000007;

        // Step 1: count the 1-bits in every bit position
        for (int x : nums)
            for (int i = 0; i < 30; i++)
                if ((x & (1 << i)) != 0) b[i]++;

        // Step 2: build k numbers, each takes one 1-bit from every position that still has one
        while (k-- > 0) {
            long x = 0;
            for (int i = 0; i < 30; i++)
                if (b[i] > 0) {
                    x |= 1L << i;
                    b[i]--;
                }
            ans = (ans + x * x) % mod;
        }

        return (int) ans;
    }
}
