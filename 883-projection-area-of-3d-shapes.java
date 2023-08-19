class Solution {
    public int projectionArea(int[][] grid) {
        int x = 0, y = 0, z = 0;
        int n = grid.length;
        for (int i=0; i<n; i++) {
            int row = grid[i][0];
            int column = grid[0][i];
            for (int j=0; j<n; j++) {
                row = Math.max(row, grid[i][j]);
                column = Math.max(column, grid[j][i]);
                if (grid[i][j] != 0)
                    z++;
            }
            x += row;
            y += column;
        }
        return x+y+z;
    }
}