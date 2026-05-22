// ═══════════════════════════════════════════════════════
// Problem: 33. Search in Rotated Sorted Array
// Difficulty: Medium
// Topics: Array, Binary Search
// Runtime: 0 ms (Beats 100.0%)
// Memory: 43.7 MB (Beats 80.3%)
// Submitted: May 22, 2026
// Link: https://leetcode.com/problems/search-in-rotated-sorted-array/
// ═══════════════════════════════════════════════════════

class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            // left half is sorted
            if(nums[low] <= nums[mid]) {

                if(nums[low] <= target &&
                   target < nums[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            // right half is sorted
            else {

                if(nums[mid] < target &&
                   target <= nums[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
