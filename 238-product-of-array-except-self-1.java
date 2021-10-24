class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        int indexFirst0 = 0;
        boolean foundFirst0 = false;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n == 0) {
                if (!foundFirst0) {
                    foundFirst0 = true;
                    indexFirst0 = i;
                } else {
                    return result;
                }
            } else product *= n;
        }
        if (foundFirst0) {
            result[indexFirst0] = product;
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = product / nums[i];
        }
        return result;
    }
}