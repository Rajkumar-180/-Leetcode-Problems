// ═══════════════════════════════════════════════════════
// Problem: 3965. Earliest Finish Time for Land and Water Rides I
// Difficulty: Easy
// Topics: Array, Two Pointers, Binary Search, Greedy, Sorting
// Runtime: 1 ms (Beats 100.0%)
// Memory: 47.3 MB (Beats 9.9%)
// Submitted: Jun 2, 2026
// Link: https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i/
// ═══════════════════════════════════════════════════════

class Solution {
    public int earliestFinishTime(int[] startL, int[] durL, int[] startW, int[] durW) {
        int minL = 3000, minW = minL, res = minW;
        int n = startL.length;
        int m = startW.length;

        for (int i = 0; i < n; i++)
            minL = Math.min(minL, startL[i] + durL[i]);

        for (int i = 0; i < m; i++) {
            minW = Math.min(minW, startW[i] + durW[i]);
            res = Math.min(res, Math.max(minL, startW[i]) + durW[i]);
        }

        for (int i = 0; i < n; i++)
            res = Math.min(res, Math.max(minW, startL[i]) + durL[i]);

        return res;
    }
}
