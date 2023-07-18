class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSums[] = new int[nums.length];
        int rightSums[] = new int[nums.length];
        leftSums[0] = 0;
        for (int i=1; i<nums.length; i++) {
            leftSums[i] = leftSums[i-1] + nums[i-1];
        }
        rightSums[rightSums.length-1] = 0;
        for (int i=nums.length-2; i>=0; i--) {
            rightSums[i] = rightSums[i+1] + nums[i+1];
        }
        int ans[] = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            ans[i] = Math.abs(leftSums[i]-rightSums[i]);
        }
        return ans;
    }
}