class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int left=0; left<arr.length; left++) {
            int currSum = 0;
            for (int right=left; right<arr.length; right++) {
                currSum += arr[right];
                sum += (right-left+1)%2 == 1 ? currSum : 0;
            }
        }
        return sum;
    }
}