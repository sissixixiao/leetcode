class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int lo = 0;
        int hi = n - 1;
        int index = 0;
        while (index <= hi) {
            if (nums[index] == 0) {
                nums[index] = nums[lo];
                nums[lo++] = 0;
                if (index < lo) index++;
            } else if (nums[index] == 2) {
                nums[index] = nums[hi];
                nums[hi--] = 2;
            } else {
                index++;
            }
        }
        while (lo <= hi) {
            nums[lo++] = 1;
        }
    }
}