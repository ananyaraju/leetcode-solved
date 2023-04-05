class Solution {
    public int dominantIndex(int[] nums) {
        int largest = -1;
        int temp = -1;
        int index = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > largest) {
                temp = largest;
                largest = nums[i];
                index = i;
            }
            else if (nums[i] > temp)
                temp = nums[i];
        }
        return (largest >= 2*temp) ? index : -1;
    }
}