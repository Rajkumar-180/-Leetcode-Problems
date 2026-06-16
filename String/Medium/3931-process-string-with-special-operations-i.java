// ═══════════════════════════════════════════════════════
// Problem: 3931. Process String with Special Operations I
// Difficulty: Medium
// Topics: String, Simulation
// Runtime: 4 ms (Beats 76.5%)
// Memory: 55.7 MB (Beats 20.6%)
// Submitted: Jun 16, 2026
// Link: https://leetcode.com/problems/process-string-with-special-operations-i/
// ═══════════════════════════════════════════════════════

class Solution {
    public String processStr(String s) {
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                ans.append(ch);
            }
            else if (ch == '*') {
                if (ans.length() > 0) {
                    ans.deleteCharAt(ans.length() - 1);
                }
            }
            else if (ch == '#') {
                ans.append(ans.toString());
            }
            else {
                ans.reverse();
            }
        }

        return ans.toString();
    }
}
