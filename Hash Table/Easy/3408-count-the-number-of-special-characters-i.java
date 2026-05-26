// ═══════════════════════════════════════════════════════
// Problem: 3408. Count the Number of Special Characters I
// Difficulty: Easy
// Topics: Hash Table, String
// Runtime: 3 ms (Beats 31.8%)
// Memory: 43.7 MB (Beats 58.5%)
// Submitted: May 26, 2026
// Link: https://leetcode.com/problems/count-the-number-of-special-characters-i/
// ═══════════════════════════════════════════════════════

class Solution {
    public int numberOfSpecialChars(String w) {
        int x = 0;
        Set<Character> a = new HashSet<>(), b = new HashSet<>();

        for (char c : w.toCharArray())
            if (Character.isLowerCase(c)) a.add(c);
            else b.add(Character.toLowerCase(c));
        for (char c : a)
            if (b.contains(c)) x++;

        return x;
    }
}
