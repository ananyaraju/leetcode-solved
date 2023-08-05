class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();
        for (int x: nums)
            set.add(x);
        int i=0, j=1;
        int count = 0;
        while (i<=j && j<nums.length) {
            if (nums[j] - nums[i] < diff)
                j++;
            else if (nums[j] - nums[i] > diff)
                i++;
            else {
                if (set.contains(nums[j]+diff))
                    count++;
                j++; i++;
            }
        }
        return count;
    }
}