// ═══════════════════════════════════════════════════════
// Problem: 2156. Stone Game IX
// Difficulty: Medium
// Topics: Array, Math, Greedy, Minimax, Counting, Game Theory, Nim Game, Zero-Sum Game
// Runtime: 3 ms (Beats 100.0%)
// Memory: 114.6 MB (Beats 82.4%)
// Submitted: Aug 16, 2026
// Link: https://leetcode.com/problems/stone-game-ix/
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] f = {0, 0, 0};

        for (int s : stones)
            f[s % 3]++;

        if ((f[0] & 1) == 0)
            return Math.min(f[1], f[2]) > 0;

        return Math.abs(f[1] - f[2]) > 2;
    }
}
