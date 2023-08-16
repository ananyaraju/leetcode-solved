class Solution {
    public int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x%y);
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0], max = nums[nums.length-1];
        return gcd(min, max);
    }
}