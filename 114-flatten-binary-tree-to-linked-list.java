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
    TreeNode last = null;
    public void flatten(TreeNode root) {
        if (root == null) return;
        last = root;
        TreeNode right = root.right;
        flatten(root.left);
        root.right = root.left;
        last.right = right;
        flatten(right);
        root.left = null;
    }
}