// ═══════════════════════════════════════════════════════
// Problem: 3405. Count the Number of Special Characters II
// Difficulty: Medium
// Topics: Hash Table, String
// Runtime: 16 ms (Beats 69.8%)
// Memory: 48.4 MB (Beats 22.3%)
// Submitted: May 27, 2026
// Link: https://leetcode.com/problems/count-the-number-of-special-characters-ii/
// ═══════════════════════════════════════════════════════

class Solution {
    public int numberOfSpecialChars(String word) {
        int[]lowerCase=new int[26];
        int[]upperCase=new int[26];
        Arrays.fill(lowerCase,-1);
        Arrays.fill(upperCase,-1);
        int ans=0;
        for(int i=0;i<word.length();i++){
            char cur=word.charAt(i);
            if(cur>='a'&&cur<='z'){
                if(upperCase[cur-'a']!=-1){
                    lowerCase[cur-'a']=-1;
                }else lowerCase[cur-'a']=i;
            }
            else{
                upperCase[cur-'A']++;
            }
        }
        for(int i=0;i<word.length();i++){
            char cur=word.charAt(i);
            if(cur>='A'&&cur<='Z'){
                if(lowerCase[cur-'A']!=-1&&lowerCase[cur-'A']<i){
                    ans++;
                    lowerCase[cur-'A']=-1;
                }
            }
        }
        return ans;
    }
}
