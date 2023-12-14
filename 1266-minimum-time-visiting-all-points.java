class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for (int i=0; i<points.length-1; i++) {
            int x = points[i][0];
            int y = points[i][1];
            int next_x = points[i+1][0];
            int next_y = points[i+1][1];
            ans += Math.max(Math.abs(next_x-x), Math.abs(next_y-y));
        }
        return ans;
    }
}