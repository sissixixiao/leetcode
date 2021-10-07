class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new LinkedList();
        Map<String, Integer> map = new HashMap();
        int lo = 0;
        int hi = 10;
        int n = s.length();
        while (hi <= n) {
            String str = s.substring(lo, hi);
            if (map.containsKey(str)) {
                if (map.get(str) == 1) {
                    result.add(str);
                    map.put(str, map.get(str) + 1);
                }
            } else map.put(str, 1);
            lo++;
            hi++;
        }
        return result;
    }
}