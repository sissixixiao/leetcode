class Solution {
    public int compareVersion(String version1, String version2) {
        String[] strs1 = version1.split("\\.");
        String[] strs2 = version2.split("\\.");
        int i = 0;
        while (i < strs1.length || i < strs2.length) {
            if (i >= strs1.length) {
                if (Integer.parseInt(strs2[i]) > 0) return -1;
            } else if (i >= strs2.length) {
                if (Integer.parseInt(strs1[i]) > 0) return 1;
            } else {
                if (Integer.parseInt(strs1[i]) > Integer.parseInt(strs2[i])) return 1;
                if (Integer.parseInt(strs1[i]) < Integer.parseInt(strs2[i])) return -1;
            }
            i++;
        }
        return 0;
    }
}