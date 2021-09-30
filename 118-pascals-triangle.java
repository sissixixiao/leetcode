class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        result.add(new ArrayList(Arrays.asList(1)));
        int layer = 1;
        while (layer < numRows) {
            List<Integer> last = result.get(result.size() - 1);
            List<Integer> cur = new ArrayList();
            cur.add(1);
            int i = 0;
            while (i + 1 < layer) {
                cur.add(last.get(i) + last.get(i + 1));
                i++;
            }
            cur.add(1);
            result.add(cur);
            layer++;
        }
        return result;
    }
}