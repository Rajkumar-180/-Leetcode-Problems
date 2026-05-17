// ═══════════════════════════════════════════════════════
// Problem: 1428. Jump Game III
// Difficulty: Medium
// Topics: Array, Depth-First Search, Breadth-First Search
// Runtime: 2 ms (Beats 82.4%)
// Memory: 52.2 MB (Beats 46.1%)
// Submitted: May 17, 2026
// Link: https://leetcode.com/problems/jump-game-iii/
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean canReach(int[] arr, int start) {
        if (start < 0 || start >= arr.length || arr[start] < 0) {
            return false;
        }
        if (arr[start] == 0) {
            return true;
        }
        int jumpDistance = arr[start];
        arr[start] = -1; // Mark as visited
        return canReach(arr, start + jumpDistance) || canReach(arr, start - jumpDistance);
    }
}
