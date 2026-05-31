// ═══════════════════════════════════════════════════════
// Problem: 2245. Destroying Asteroids
// Difficulty: Medium
// Topics: Array, Greedy, Sorting
// Runtime: 27 ms (Beats 31.2%)
// Memory: 107.4 MB (Beats 65.1%)
// Submitted: May 31, 2026
// Link: https://leetcode.com/problems/destroying-asteroids/
// ═══════════════════════════════════════════════════════

class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currMass = mass;

        for (int asteroid : asteroids) {
            if (currMass < asteroid)
                return false;

            currMass += asteroid;
        }

        return true;
    }
}
