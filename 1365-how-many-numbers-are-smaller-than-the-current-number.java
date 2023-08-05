class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int sorted[] = nums.clone();
        Arrays.sort(sorted);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<sorted.length; i++) {
            map.put(sorted[i], map.getOrDefault(sorted[i], i));
        }
        for (int i=0; i<nums.length; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}