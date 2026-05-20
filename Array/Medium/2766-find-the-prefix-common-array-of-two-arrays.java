// ═══════════════════════════════════════════════════════
// Problem: 2766. Find the Prefix Common Array of Two Arrays
// Difficulty: Medium
// Topics: Array, Hash Table, Bit Manipulation
// Runtime: 1 ms (Beats 100.0%)
// Memory: 47.3 MB (Beats 69.8%)
// Submitted: May 20, 2026
// Link: https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;

        int[] freq = new int[n + 1];
        int[] ans = new int[n];

        int cnt = 0;

        for(int i = 0; i < n; i++) {

            freq[A[i]]++;
            if(freq[A[i]] == 2) cnt++;

            freq[B[i]]++;
            if(freq[B[i]] == 2) cnt++;

            ans[i] = cnt;
        }

        return ans;
    }
}
