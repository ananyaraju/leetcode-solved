class Solution {
    public int[] circularGameLosers(int n, int k) {
        boolean seen[] = new boolean[n];
        seen[0] = true;
        int i = 1;
        int curr = 0;
        while (true) {
            int next = (curr + k*i) % n;
            i++;
            if (seen[next])
                break;
            seen[next] = true;
            curr = next;
        }
        List<Integer> ans = new ArrayList<>();
        for (int j=0; j<n; j++)
            if (!seen[j])
                ans.add(j+1);
        int res[] = new int[ans.size()];
        for (int j=0; j<res.length; j++)
            res[j] = ans.get(j);
        return res;
    }
}