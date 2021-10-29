class Solution {
    int i = 0;
    public boolean verifyPreorder(int[] preorder) {
        return helper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public boolean helper(int[] preorder, int minValue, int maxValue) {
        if (i == preorder.length) return true;
        int val = preorder[i];
        if (val < minValue || val > maxValue) return false;
        i++;
        return helper(preorder, minValue, val) || helper(preorder, val, maxValue);
    }
}