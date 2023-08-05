class Solution {
    public int localMax(int[][] grid, int i, int j) {
        int max = grid[i][j];
        for (int x=i; x<i+3; x++)
            for (int y=j; y<j+3; y++)
                max = Math.max(grid[x][y], max);
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length - 2;
        int[][] ans = new int[n][n];
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                ans[i][j] = localMax(grid, i, j);
        return ans;
    }
}