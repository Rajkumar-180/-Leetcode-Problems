// ═══════════════════════════════════════════════════════
// Problem: 1784. Minimum Initial Energy to Finish Tasks
// Difficulty: Hard
// Topics: Array, Greedy, Sorting
// Runtime: 23 ms (Beats 88.5%)
// Memory: 114 MB (Beats 40.4%)
// Submitted: May 12, 2026
// Link: https://leetcode.com/problems/minimum-initial-energy-to-finish-tasks/
// ═══════════════════════════════════════════════════════

class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

        int curr = 0;
        int ans  = 0;
        for (int[] task : tasks) {
            int actual  = task[0];
            int minimum = task[1];
            if (curr < minimum) {
                ans  += (minimum - curr);
                curr  = minimum;
            }
            curr -= actual;
        }
        return ans;
    }
}
