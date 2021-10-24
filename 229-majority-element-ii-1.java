class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new LinkedList();
        // num, count
        Map<Integer, Integer> map = new HashMap();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > nums.length / 3) result.add(key);
        }
        return result;
    }
}