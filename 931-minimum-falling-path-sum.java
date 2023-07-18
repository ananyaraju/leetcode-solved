class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length; int m = matrix[0].length;
        int dp[][] = new int[n][m];
        for (int i=0; i<m; i++)
            dp[0][i] = matrix[0][i];
        for (int level=1; level<n; level++) {
            for (int i=0; i<m; i++) {
                if (i == 0) {
                    dp[level][i] = matrix[level][i] + Math.min(dp[level-1][i], dp[level-1][i+1]);
                }
                else if (i == m-1) {
                    dp[level][i] = matrix[level][i] + Math.min(dp[level-1][i], dp[level-1][i-1]);
                }
                else
                    dp[level][i] = matrix[level][i] + Math.min(Math.min(dp[level-1][i], dp[level-1][i-1]), dp[level-1][i+1]);
            }
        }
        int ans = dp[n-1][m-1];
        for (int x: dp[n-1])
            ans = Math.min(ans, x);
        return ans;
    }
}