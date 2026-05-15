// ═══════════════════════════════════════════════════════
// Problem: 153. Find Minimum in Rotated Sorted Array
// Difficulty: Medium
// Topics: Array, Binary Search
// Runtime: 0 ms (Beats 100.0%)
// Memory: 43.7 MB (Beats 54.2%)
// Submitted: May 15, 2026
// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// ═══════════════════════════════════════════════════════

class Solution {
    public int findMin(int[] nums) {
        int n = nums.length - 1;
        int last = nums[n];
        int left = 0, right = n;

        while (left < right) {
            int mid = (left + right) >> 1;
            if (nums[mid] > last) left = mid + 1;
            else right = mid;
        }

        return nums[left];
    }
}
