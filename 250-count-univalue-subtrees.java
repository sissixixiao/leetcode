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
    int result = 0;
    
    public int countUnivalSubtrees(TreeNode root) {
        all(root, 0);
        return result;
    }
    
    private boolean all(TreeNode root, int val) {
        if (root == null) return true;
        boolean left = all(root.left, root.val);
        boolean right = all(root.right, root.val);
        if (!left  || !right) return false;
        result++;
        return root.val == val;
    }
}