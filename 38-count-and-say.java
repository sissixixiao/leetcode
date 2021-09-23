class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String s = "1";
        while (n > 1) {
            s = countAndSay(s);
            n--;
        }
        return s;
    }
    
    private String countAndSay(String s) {
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while (index < s.length()) {
            int c = 1;
            while (index + c < s.length() && s.charAt(index + c) == s.charAt(index)) {
                c++;
            }
            sb.append(c);
            sb.append(s.charAt(index));
            index += c;
        }
        return sb.toString();
    }
}