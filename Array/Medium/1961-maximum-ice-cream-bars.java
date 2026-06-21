// ═══════════════════════════════════════════════════════
// Problem: 1961. Maximum Ice Cream Bars
// Difficulty: Medium
// Topics: Array, Greedy, Sorting, Counting Sort
// Runtime: 10 ms (Beats 80.5%)
// Memory: 82.3 MB (Beats 96.5%)
// Submitted: Jun 21, 2026
// Link: https://leetcode.com/problems/maximum-ice-cream-bars/
// ═══════════════════════════════════════════════════════

class Solution {
    public int maxIceCream(int[] costs, int coins) {

        final int MAX_COST = 100000;

        int[] freq = new int[MAX_COST + 1];

        for (int cost : costs) {
            freq[cost]++;
        }

        int answer = 0;

        for (int cost = 1; cost <= MAX_COST; cost++) {

            if (freq[cost] == 0) {
                continue;
            }

            int canBuy = Math.min(freq[cost], coins / cost);

            answer += canBuy;

            coins -= canBuy * cost;
        }

        return answer;
    }
}
