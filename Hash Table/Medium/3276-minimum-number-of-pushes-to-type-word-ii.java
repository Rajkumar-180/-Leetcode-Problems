// ═══════════════════════════════════════════════════════
// Problem: 3276. Minimum Number of Pushes to Type Word II
// Difficulty: Medium
// Topics: Hash Table, String, Greedy, Sorting, Counting
// Runtime: 9 ms (Beats 94.2%)
// Memory: 48.1 MB (Beats 52.6%)
// Submitted: Jul 31, 2026
// Link: https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/
// ═══════════════════════════════════════════════════════

class Solution {
    public int minimumPushes(String word) {
        int[] hashTable = new int[26];

        for(char ch : word.toCharArray()){
            hashTable[ch - 'a']++;
        }

        int minPushing = 0;

        Arrays.sort(hashTable);

        for(int i = 25, pushCnt = 0; i >= 0; i--){
            int currEleIdx = 25 - i;

            if(currEleIdx % 8 == 0)
                pushCnt++;

            minPushing += hashTable[i] * pushCnt;
        }

        return minPushing;
    }
}
