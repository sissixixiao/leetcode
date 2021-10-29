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
    public int closestValue(TreeNode root, double target) {
        if (root == null) return Integer.MAX_VALUE;
        if (root.left == null && root.right == null || root.val * 1.0 == target) return root.val;
        int result = root.val;
        double rootdiff = Math.abs(root.val - target);
        if (root.val > target) {
            if (root.left != null) {
                int left = closestValue(root.left, target);
                if (rootdiff > Math.abs(left - target)) result = left;
            }
        } else {
            if (root.right != null) {
                int right = closestValue(root.right, target);
                if (rootdiff > Math.abs(right - target)) result = right;
            }
        }
        return result;
    }
}