// ═══════════════════════════════════════════════════════
// Problem: 3606. Minimum Element After Replacement With Digit Sum
// Difficulty: Easy
// Topics: Array, Math
// Runtime: 1 ms (Beats 100.0%)
// Memory: 44.9 MB (Beats 40.6%)
// Submitted: May 29, 2026
// Link: https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/
// ═══════════════════════════════════════════════════════

class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int sum = 0;

            while(num > 0) {
                sum += (num % 10);
                num /= 10;
            }

            ans = Math.min(ans, sum);
        }

        return ans;
    }
}
