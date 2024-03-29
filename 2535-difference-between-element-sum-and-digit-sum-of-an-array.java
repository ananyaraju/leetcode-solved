class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0, digSum = 0;
        for (int i=0; i<nums.length; i++) {
            eleSum += nums[i];
            while (nums[i] > 0) {
                digSum += nums[i]%10;
                nums[i] /= 10;
            }
        }
        return Math.abs(eleSum - digSum);
    }
}