class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        for (int i=0; i<nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (nums[i]+nums[j] == target) {
                    ans[0] = i; ans[1] = j;
                }
            }
        }
        return ans;
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++)
            map.put(nums[i], i);
        for (int i=0; i<nums.length; i++) {
            if (map.containsKey(target-nums[i]) && map.get(target-nums[i])!=i)
                return new int[] {i, map.get(target-nums[i])};
        }
        return null;
    }
}