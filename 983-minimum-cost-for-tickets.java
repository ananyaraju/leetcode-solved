class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int last = days[days.length - 1];
        int dp[] = new int[last + 1];
        int currDay = 0;
        for (int i=1; i<=last; i++) {
            if (i < days[currDay])
                dp[i] = dp[i-1];
            else {
                currDay++;
                dp[i] = Math.min(dp[i-1]+costs[0], Math.min(dp[Math.max(0, i-7)]+costs[1], dp[Math.max(0, i-30)]+costs[2]));
            }
        }
        return dp[last];
    }
}