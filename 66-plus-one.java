class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] result = new int[n];
        int index = n - 1;
        while (index >= 0 && digits[index] == 9) {
            result[index] = 0;
            index--;
        }
        if (index < 0) {
            int[] newResult = new int[n + 1];
            newResult[0] = 1;
            return newResult;
        }
        result[index] = digits[index] + 1;
        index--;
        while (index >= 0) {
            result[index] = digits[index];
            index--;
        }
        return result;
    }
}