// ═══════════════════════════════════════════════════════
// Problem: 3329. Find the Length of the Longest Common Prefix
// Difficulty: Medium
// Topics: Array, Hash Table, String, Trie
// Runtime: 41 ms (Beats 89.4%)
// Memory: 81 MB (Beats 67.0%)
// Submitted: May 21, 2026
// Link: https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/
// ═══════════════════════════════════════════════════════

class Solution {
    int max = 0;

    class ListNode {
        ListNode[] val = new ListNode[10];
    }

    ListNode parent = new ListNode();

    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        for(int num : arr1){
            insert(String.valueOf(num));
        }

        for(int num : arr2){
            counter(String.valueOf(num));
        }

        return max;

    }

    private void insert(String number){
        ListNode node = parent;
        for(char ch : number.toCharArray()){
            int pos = ch - '0';
            if(node.val[pos] == null){
                node.val[pos] = new ListNode();
            }
            node = node.val[pos];
        }
    }

    private void counter(String number){
        ListNode node = parent;
        int count = 0;
        for(char ch : number.toCharArray()){
            int pos = ch - '0';
            if(node.val[pos] == null){
                return;
            }
            node = node.val[pos];
            count++;
            max = Math.max(max,count);
        }

    }

    
}
