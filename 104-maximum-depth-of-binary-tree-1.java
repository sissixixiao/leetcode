/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        traverse(root, 1);
        return maxDepth;
    }
    
    private void traverse(TreeNode root, int depth) {
        if (root == null) return;
        if (depth > maxDepth) maxDepth = depth;
        traverse(root.left, depth + 1);
        traverse(root.right, depth + 1);
    }
}