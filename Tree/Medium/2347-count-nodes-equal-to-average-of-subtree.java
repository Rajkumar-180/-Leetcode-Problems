// ═══════════════════════════════════════════════════════
// Problem: 2347. Count Nodes Equal to Average of Subtree
// Difficulty: Medium
// Topics: Tree, Depth-First Search, Binary Tree
// Runtime: 1 ms (Beats 56.3%)
// Memory: 45.8 MB (Beats 16.9%)
// Submitted: Sep 10, 2026
// Link: https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/
// ═══════════════════════════════════════════════════════

class Solution {
    int ans = 0;
    public int averageOfSubtree(TreeNode root) {
        dfs(root);
        return ans;
    }
    private int[] dfs(TreeNode node) {
        if (node == null) return new int[]{0, 0};
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);
        int sum = left[0] + right[0] + node.val;
        int cnt = left[1] + right[1] + 1;
        if (sum / cnt == node.val) ans++;
        return new int[]{sum, cnt};
    }
}
