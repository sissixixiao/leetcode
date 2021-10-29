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
        if (root.left == null && root.right == null) return root.val;
        if (root.val * 1.0 == target) return root.val;
        double rootdiff = Math.abs(root.val - target);
        if (root.val > target) {
            if (root.left == null) return root.val;
            int left = closestValue(root.left, target);
            double diff = Math.abs(left - target);
            if (rootdiff <= diff) return root.val;
            else return left;
        } else {
            if (root.right == null) return root.val;
            int right = closestValue(root.right, target);
            double diff = Math.abs(right - target);
            if (rootdiff <= diff) return root.val;
            else return right;
        }
    }
}