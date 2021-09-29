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
    public boolean isBalanced(TreeNode root) {
        return helper(root).isb;
    }
    
    private ReturnType helper(TreeNode root) {
        if (root == null) return new ReturnType(true, 0);
        ReturnType left = helper(root.left);
        ReturnType right = helper(root.right);
        return new ReturnType(left.isb && right.isb && (Math.abs(left.height - right.height) <= 1), Math.max(left.height, right.height) + 1);
    }
    
    class ReturnType {
        boolean isb;
        int height;
        ReturnType(boolean b, int i) {
            isb = b;
            height = i;
        }
    }
}