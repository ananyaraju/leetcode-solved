class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int sum = 0;
        int max;
        for (int[] x: grid)
            Arrays.sort(x);
        for (int i=0; i<grid[0].length; i++) {
            max = grid[0][i];
            for (int j=0; j<grid.length; j++) {
                max = Math.max(max, grid[j][i]);
            }
            sum += max;
        }
        return sum;
    }
}