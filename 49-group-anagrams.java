class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String sortedStr = new String(ca);
            if (map.containsKey(sortedStr)) {
                map.get(sortedStr).add(str);
            } else {
                List<String> list = new LinkedList<>();
                list.add(str);
                map.put(sortedStr, list);
            }
        }
        List<List<String>> result = new LinkedList<>();
        for (List<String> l : map.values()) {
            result.add(l);
        }
        return result;
    }
}