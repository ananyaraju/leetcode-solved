class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> treeset = new TreeSet<>();
        for (int i=0; i<nums.length; i++)
            if (!treeset.contains(nums[i]))
                treeset.add(nums[i]);
        if (treeset.size() <= 2)
            return (int)treeset.toArray()[treeset.size()-1];
        else 
            return (int)treeset.toArray()[treeset.size()-3];
    }
}