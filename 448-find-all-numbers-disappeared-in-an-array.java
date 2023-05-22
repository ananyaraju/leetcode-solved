class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hashset = new HashSet<Integer>();
        for (int i=0; i<nums.length; i++)
            hashset.add(nums[i]);
        List<Integer> list = new ArrayList<Integer>();
        int num = 1;
        for (int i=0; i<nums.length; i++) {
            if (!hashset.contains(num))
                list.add(num);
                num++;
        }
        return list;
    }
}