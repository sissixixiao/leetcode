class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        
        int cm = num / 1000;
        while (cm-- > 0) sb.append("M");
        num = num % 1000;
        if (num >= 900) {
            sb.append("CM");
            num -= 900;
        }
        
        int cd = num / 500;
        while (cd-- > 0) sb.append("D");
        num = num % 500;
        if (num >= 400) {
            sb.append("CD");
            num -= 400;
        }
        
        int cc = num / 100;
        while (cc-- > 0) sb.append("C");
        num = num % 100;
        if (num >= 90) {
            sb.append("XC");
            num -= 90;
        }
        
        int cl = num / 50;
        while (cl-- > 0) sb.append("L");
        num = num % 50;
        if (num >= 40) {
            sb.append("XL");
            num -= 40;
        }
        
        int cx = num / 10;
        while (cx-- > 0) sb.append("X");
        num = num % 10;
        if (num >= 9) {
            sb.append("IX");
            num -= 9;
        }
        
        int cv = num / 5;
        while (cv-- > 0) sb.append("V");
        num = num % 5;
        if (num >= 4) {
            sb.append("IV");
            num -= 4;
        }
        
        while (num-- > 0) sb.append("I");
        
        return sb.toString();
    }
}