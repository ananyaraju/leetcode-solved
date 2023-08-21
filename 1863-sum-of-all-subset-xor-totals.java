class Solution {
    
    public int subsetXORSum(int[] nums) {
        return backtrack(nums, 0, 0);
    }

    public int backtrack(int[] nums, int sum, int index) {
        if (index == nums.length)
            return sum;
        int with = backtrack(nums, sum ^ nums[index], index+1);
        int without = backtrack(nums, sum, index+1);
        return with + without;
    }

}