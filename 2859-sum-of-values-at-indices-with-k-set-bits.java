class Solution {
    public int getOnes(int num) {
        int count = 0;
        String binary = Integer.toBinaryString(num);
        for (char x: binary.toCharArray()) {
            if (x == '1')
                count++;
        }
        return count;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for (int i=0; i<nums.size(); i++) {
            int bits = getOnes(i);
            if (bits == k)
                ans += nums.get(i);
        }
        return ans;
    }
}