class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet();
        while (n != 1) {
            if (set.contains(n)) return false;
            set.add(n);
            int s = 0;
            int num = n;
            while (num > 0) {
                int d = num % 10;
                s += d * d;
                num /= 10;
            }
            n = s;
        }
        return true;
    }
}