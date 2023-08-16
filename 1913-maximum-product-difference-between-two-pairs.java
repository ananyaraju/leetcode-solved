class Solution {
    public int maxProductDifference(int[] nums) {
        int min = nums[0]*nums[1], max = 0;
        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                int prod = nums[i] * nums[j];
                min = Math.min(min, prod);
                max = Math.max(max, prod);
            }
        }
        return max-min;
    }
}