// ═══════════════════════════════════════════════════════
// Problem: 1297. Maximum Number of Balloons
// Difficulty: Easy
// Topics: Hash Table, String, Counting
// Runtime: 1 ms (Beats 100.0%)
// Memory: 43.4 MB (Beats 62.0%)
// Submitted: Jun 22, 2026
// Link: https://leetcode.com/problems/maximum-number-of-balloons/
// ═══════════════════════════════════════════════════════

class Solution {
    public int maxNumberOfBalloons(String text) {
        int[]arr=new int[26];
        for(char c:text.toCharArray()){
            arr[c-'a']++;
        }
        String target="balloon";
        int ans=arr['b'-'a'];
        for(char c:target.toCharArray()){
            if(c=='l'||c=='o'){
                int index=c-'a';
                if(arr[index]<2){
                    return 0;
                }
                else{
                    ans=Math.min(ans,arr[index]/2);
                }
            }
            else ans=Math.min(ans,arr[c-'a']);
        }
        return ans;
    }
}
