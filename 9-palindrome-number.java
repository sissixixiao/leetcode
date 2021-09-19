class Solution {
    public boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x % 10 == 0 || x < 0) return false;
        long reverse = 0;
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        return reverse == x || reverse / 10 == x;
    }
}