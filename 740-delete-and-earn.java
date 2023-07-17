class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int x: nums)
            max = Math.max(max, x);
        int freq[] = new int[max+1];
        for (int x: nums)
            freq[x]++;
        int dp[] = new int[max+1];
        dp[0] = freq[0];
        dp[1] = freq[1];
        for (int i=2; i<dp.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2]+freq[i]*i);
        }
        return dp[dp.length-1];
    }
}