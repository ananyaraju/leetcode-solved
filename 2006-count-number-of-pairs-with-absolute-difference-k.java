class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (Math.abs(nums[j]-nums[i]) == k)
                    count++;
            }
        }
        return count;
    }
}