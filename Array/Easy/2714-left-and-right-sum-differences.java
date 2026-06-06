// ═══════════════════════════════════════════════════════
// Problem: 2714. Left and Right Sum Differences
// Difficulty: Easy
// Topics: Array, Prefix Sum
// Runtime: 2 ms (Beats 98.8%)
// Memory: 46.5 MB (Beats 48.0%)
// Submitted: Jun 6, 2026
// Link: https://leetcode.com/problems/left-and-right-sum-differences/
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int[] pre = new int[n];
        int[] suf = new int[n];
        int[] ans = new int[n];

        for (int i = 1; i < n; i++)
            pre[i] = pre[i - 1] + nums[i - 1];

        for (int i = n - 2; i >= 0; i--)
            suf[i] = suf[i + 1] + nums[i + 1];

        for (int i = 0; i < n; i++)
            ans[i] = Math.abs(pre[i] - suf[i]);

        return ans;
    }
}
