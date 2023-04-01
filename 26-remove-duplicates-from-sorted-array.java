class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 1;
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                continue;
            }
            else {
                nums[unique] = nums[i+1];
                unique++;
            }
        }
        return unique;
    }
}