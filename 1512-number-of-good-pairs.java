class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int x: nums)
            map.put(x, map.getOrDefault(x, 0)+1);
        int pairs = 0;
        int count = 0;
        Iterator i = map.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry e = (Map.Entry)i.next();
            count += (int)e.getValue()*((int)e.getValue()-1)/2;
        }
        return count;
    }
}