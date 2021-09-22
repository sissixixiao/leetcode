class Solution {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] arr = new int[s.length()];
        int result = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I') arr[i] = 1;
            else if (s.charAt(i) == 'V') arr[i] = 5;
            else if (s.charAt(i) == 'X') arr[i] = 10;
            else if (s.charAt(i) == 'L') arr[i] = 50;
            else if (s.charAt(i) == 'C') arr[i] = 100;
            else if (s.charAt(i) == 'D') arr[i] = 500;
            else if (s.charAt(i) == 'M') arr[i] = 1000;
            if (i != arr.length - 1 && arr[i] < arr[i + 1]) result -= arr[i];
            else result += arr[i];
        }
        return result;
    }
}