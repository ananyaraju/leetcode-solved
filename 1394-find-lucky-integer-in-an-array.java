class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int x: arr)
            map.put(x, map.getOrDefault(x, 0)+1);
        Iterator i = map.entrySet().iterator();
        int ans = -1;
        while (i.hasNext()) {
            Map.Entry e = (Map.Entry)i.next();
            if ((int)e.getKey() == (int)e.getValue())
                ans = (int)e.getKey();
        }
        return ans;
    }
}