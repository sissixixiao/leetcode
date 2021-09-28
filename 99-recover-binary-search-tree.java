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
    public void recoverTree(TreeNode root) {
        ArrayList<Integer> list = new ArrayList();
        inorder(list, root);
        System.out.println(list);
        int[] swapped = findTwoSwapped(list);
        System.out.println(swapped[0]);
        System.out.println(swapped[1]);
        recoverTree(root, 2, swapped[0], swapped[1]);
    }
    
    private void recoverTree(TreeNode root, int remaining, int p, int q) {
        if (root == null) return;
        if (root.val == p || root.val == q) {
            if (root.val == p) root.val = q;
            else if (root.val == q) root.val = p;
            remaining--;
            if (remaining == 0) return;
        }
        recoverTree(root.left, remaining, p, q);
        recoverTree(root.right, remaining, p, q);
    }
    
    private void inorder(List<Integer> list, TreeNode root) {
        if (root == null) return;
        inorder(list, root.left);
        list.add(root.val);
        inorder(list, root.right);
    }
    
    private int[] findTwoSwapped(List<Integer> list) {
        int[] result = new int[2];
        boolean findOne = false;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                if (!findOne) {
                    result[0] = list.get(i - 1);
                    result[1] = list.get(i);
                    findOne = true;
                } else {
                    result[1] = list.get(i);
                    return result;
                }
            }
        }
        return result;
    }
}