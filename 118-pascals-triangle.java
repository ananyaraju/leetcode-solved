class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(1); ans.add(list);
        for (int i=2; i<=numRows; i++) {
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j=0; j<list.size()-1; j++) {
                curr.add(list.get(j)+list.get(j+1));
            }
            curr.add(1);
            ans.add(curr);
            list = curr;
        }
        return ans;
    }
}