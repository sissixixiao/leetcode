class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int n : nums) {
            if (!set.contains(n)) set.add(n);
            else set.remove(n);
        }
        int[] result = new int[2];
        Iterator<Integer> it = set.iterator();
        result[0] = it.next();
        result[1] = it.next();
        return result;
    }
}