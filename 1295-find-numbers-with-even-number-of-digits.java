class Solution {

    public boolean hasEvenDigits(int N) {
        int digit = 0;
        while (N>0) {
            N = N/10;
            digit++;
        }
        if (digit%2 == 0)
            return true;
        else
            return false;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (hasEvenDigits(nums[i]) == true) {
                count++;
            }
        }
        return count;
    }
    
}