// ═══════════════════════════════════════════════════════
// Problem: 3967. Earliest Finish Time for Land and Water Rides II
// Difficulty: Medium
// Topics: Array, Two Pointers, Binary Search, Greedy, Sorting
// Runtime: 2 ms (Beats 100.0%)
// Memory: 92 MB (Beats 46.6%)
// Submitted: Jun 3, 2026
// Link: https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-ii/
// ═══════════════════════════════════════════════════════

// same question as leetcode 3633 but  allow brute force
//O(M + N)
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int land_water = solve(landStartTime , landDuration , waterStartTime , waterDuration);

        int water_land = solve(waterStartTime , waterDuration , landStartTime , landDuration);
        
        return Math.min(land_water , water_land);
    }

    public int solve(int[] start1 , int[] duration1 , int[] start2 , int[] duration2){
        int finish1 = Integer.MAX_VALUE;
        for(int i  = 0 ; i< start1.length ; i++){
            finish1 = Math.min(finish1 , start1[i] + duration1[i]);   
        }

        int finish2 = Integer.MAX_VALUE;
        for(int i = 0 ; i <start2.length ;i++){
            finish2 = Math.min(finish2 , Math.max(start2[i],finish1)+ duration2[i]);
        }

        return finish2;
    }
}
