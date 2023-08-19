class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        List<Integer> prev = new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        prev.add(1); triangle.add(prev);
        if (rowIndex == 0)
            return prev;
        for (int i=2; i<=rowIndex+1; i++) {
            level = new ArrayList<>();
            level.add(1);
            for (int j=0; j<prev.size()-1; j++) {
                level.add(prev.get(j) + prev.get(j+1));
            }
            level.add(1);
            triangle.add(level);
            prev = level;
        }
        return level;
    }
}