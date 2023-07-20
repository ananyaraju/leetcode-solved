// Linear
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i]+1 != nums[i+1])
                return nums[i]+1;
        }
        if (nums[0] == 0) return nums[nums.length-1]+1;
        else return 0;
    }
}

// XOR
class Solution {
    public int missingNumber(int[] nums) {
        int missing = 0;
        for (int i=1; i<=nums.length; i++) {
            missing = missing ^ nums[i-1] ^ i;
        }
        return missing;
    }
}