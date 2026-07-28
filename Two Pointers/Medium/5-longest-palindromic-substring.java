// ═══════════════════════════════════════════════════════
// Problem: 5. Longest Palindromic Substring
// Difficulty: Medium
// Topics: Two Pointers, String, Dynamic Programming
// Runtime: 577 ms (Beats 14.1%)
// Memory: 47.3 MB (Beats 10.2%)
// Submitted: Jul 28, 2026
// Link: https://leetcode.com/problems/longest-palindromic-substring/
// ═══════════════════════════════════════════════════════

public class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        String maxStr = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + maxLen; j <= s.length(); j++) {
                if (j - i > maxLen && isPalindrome(s.substring(i, j))) {
                    maxLen = j - i;
                    maxStr = s.substring(i, j);
                }
            }
        }

        return maxStr;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
