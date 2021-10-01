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
    int result;
    public int sumNumbers(TreeNode root) {
        if (root == null) return 0;
        backtrack(root, 0);
        return result;
    }
    
    private void backtrack(TreeNode root, int sum) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            result += (sum * 10 + root.val);
        } else {
            backtrack(root.left, sum * 10 + root.val);
            backtrack(root.right, sum * 10 + root.val);
        }
    }
}