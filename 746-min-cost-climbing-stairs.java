class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int curr;
        int step1 = cost[0], step2 = cost[1];
        if (cost.length <= 2)
            return Math.min(step1, step2);
        for (int i=2; i<cost.length; i++) {
            curr = cost[i] + Math.min(step1, step2);
            step1 = step2;
            step2 = curr;
        }
        return Math.min(step1, step2);
    }
}