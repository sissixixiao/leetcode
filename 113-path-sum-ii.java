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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new LinkedList();
        if (root == null) return result;
        backtrack(result, root, targetSum, new LinkedList());
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, TreeNode root, int targetSum, List<Integer> cur) {
        if (root == null) return;
        if (root.val == targetSum && root.left == null && root.right == null) {
            cur.add(root.val);
            result.add(new LinkedList(cur));
            cur.remove(cur.size() - 1);
        } else {
            cur.add(root.val);
            backtrack(result, root.left, targetSum - root.val, cur);
            backtrack(result, root.right, targetSum - root.val, cur);
            cur.remove(cur.size() - 1);
        }
    }
}