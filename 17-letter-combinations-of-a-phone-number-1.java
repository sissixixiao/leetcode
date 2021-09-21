class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        for (char digit : digits.toCharArray()) { // digit = 7
            String s = map.get(digit); // s = pqrs
            if (result.size() == 0) {
                for (char c : s.toCharArray()) result.add(c + "");
            } else {
                List<String> newResult = new LinkedList<>(); // result: a, b, c
                for (String ss : result) {
                    for (char c : s.toCharArray()) {
                        newResult.add(ss + c);
                    }
                }
                result = newResult;
            }
        }
        return result;
    }
}