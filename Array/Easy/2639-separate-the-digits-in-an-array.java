// ═══════════════════════════════════════════════════════
// Problem: 2639. Separate the Digits in an Array
// Difficulty: Easy
// Topics: Array, Simulation
// Runtime: 10 ms (Beats 10.8%)
// Memory: 47.1 MB (Beats 10.5%)
// Submitted: May 11, 2026
// Link: https://leetcode.com/problems/separate-the-digits-in-an-array/
// ═══════════════════════════════════════════════════════

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        for(int val:nums){
            List<Integer>cur=new ArrayList<>();
            while(val>0){
                cur.add(val%10);
                val/=10;
            }
            ans.addAll(cur.reversed());
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
