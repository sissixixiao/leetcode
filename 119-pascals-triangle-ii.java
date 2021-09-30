class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList();
        result.add(1);
        if (rowIndex == 0) return result;
        result.add(1);
        if (rowIndex == 1) return result;
        while (--rowIndex > 0) {
            int size = result.size();
            int i = 0;
            while (i < size - 1) {
                result.set(i, result.get(i) + result.get(i + 1));
                i++;
            }
            result.add(0, 1);
        }
        return result;
    }
}