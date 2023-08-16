class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> ans = new ArrayList<>();
        int visits[] = new int[n];
        visits[rounds[0]-1] = 1;
        int max = 0;
        for (int i=0; i<rounds.length-1; i++) {
            int start = rounds[i] - 1;
            int end = rounds[i+1] - 1;
            if (start < end) {
                for (int j=start+1; j<=end; j++) {
                    visits[j]++;
                    max = Math.max(max, visits[j]);
                }
            }
            else if (start > end) {
                for (int j=start+1; j<n; j++) {
                    visits[j]++;
                    max = Math.max(max, visits[j]);
                }
                for (int j=0; j<=end; j++) {
                    visits[j]++;
                    max = Math.max(max, visits[j]);
                }
            }
        }
        for (int i=0; i<visits.length; i++) {
            if (visits[i] == max)
                ans.add(i+1);
        }
        return ans;
    }
}