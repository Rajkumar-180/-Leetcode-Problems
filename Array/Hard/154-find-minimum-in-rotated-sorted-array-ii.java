// ═══════════════════════════════════════════════════════
// Problem: 154. Find Minimum in Rotated Sorted Array II
// Difficulty: Hard
// Topics: Array, Binary Search
// Runtime: 0 ms (Beats 100.0%)
// Memory: 44.7 MB (Beats 85.0%)
// Submitted: May 16, 2026
// Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
// ═══════════════════════════════════════════════════════

class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] < nums[r])
                r = mid;
            else if (nums[mid] > nums[r])
                l = mid + 1;
            else
                r--;
        }
        return nums[l];
    }
}
