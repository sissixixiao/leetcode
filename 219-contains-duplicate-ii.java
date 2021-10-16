class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // num, index
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (map.containsKey(n)) {
                if (Math.abs(map.get(n) - i) <= k) return true;
                else map.put(n, i);
            } else {
                map.put(n, i);
            }
        }
        return false;
    }
}