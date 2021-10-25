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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList();
        if (root == null) return result;
        if (root.left == null && root.right == null) {
            result.add(root.val + "");
        } else {
            if (root.left != null) {
                List<String> left = binaryTreePaths(root.left);
                for (String s : left) {
                    result.add(root.val + "->" + s);
                }
            }
            if (root.right != null) {
                List<String> left = binaryTreePaths(root.right);
                for (String s : left) {
                    result.add(root.val + "->" + s);
                }
            }
        }
        return result;
    }
}