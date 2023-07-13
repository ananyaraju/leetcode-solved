class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int n = grid[0].length;
        for (int i=0; i<grid.length; i++) {
            int lo = 0, hi = n-1;
            while (lo <= hi) {
                int mid = lo + (hi-lo)/2;
                if (grid[i][mid] >= 0)
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
            count = count + n - lo;
        }
        return count;
    }
}