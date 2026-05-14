// ═══════════════════════════════════════════════════════
// Problem: 2892. Check if Array is Good
// Difficulty: Easy
// Topics: Array, Hash Table, Sorting
// Runtime: 1 ms (Beats 91.0%)
// Memory: 45.1 MB (Beats 31.8%)
// Submitted: May 14, 2026
// Link: https://leetcode.com/problems/check-if-array-is-good/
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length - 1;
        Set<Integer> seen = new HashSet<>();
        boolean dup = false;

        for (int num : nums) {
            if (num > n) return false;

            if (seen.contains(num)) {
                if (num < n || dup) return false;
                dup = true;
                continue;
            }

            seen.add(num);
        }

        return true;
    }
}
