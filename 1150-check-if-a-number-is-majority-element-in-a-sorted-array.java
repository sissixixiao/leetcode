class Solution {
    public boolean isMajorityElement(int[] nums, int target) {
        int firstOccurrence = binarySearch(nums, target);
        System.out.println(firstOccurrence);
        return firstOccurrence != -1 && firstOccurrence + nums.length / 2 < nums.length && nums[firstOccurrence + nums.length / 2] == target;
    }
    
    public int binarySearch(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo + 1 < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= target) hi = mid;
            else lo = mid;
        }
        return nums[lo] == target ? lo : nums[hi] == target ? hi : -1;
    }
}