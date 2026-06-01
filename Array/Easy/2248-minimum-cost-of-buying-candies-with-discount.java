// ═══════════════════════════════════════════════════════
// Problem: 2248. Minimum Cost of Buying Candies With Discount
// Difficulty: Easy
// Topics: Array, Greedy, Sorting
// Runtime: 5 ms (Beats 96.1%)
// Memory: 44.5 MB (Beats 69.6%)
// Submitted: Jun 1, 2026
// Link: https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/
// ═══════════════════════════════════════════════════════

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;

        for (int i = cost.length - 1; i >= 0; i -= 3) {
            sum += cost[i];
            if (i > 0) {
                sum += cost[i - 1];
            }
        }
        return sum;
    }
}
