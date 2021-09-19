class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x % 10 == 0 || x < 0) return false;
        long reverse = 0;
        int xx = x;
        while (xx != 0) {
            reverse = reverse * 10 + xx % 10;
            xx = xx / 10;
        }
        return reverse == x;
    }
}