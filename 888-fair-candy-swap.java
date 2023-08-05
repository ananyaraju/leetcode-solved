class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int ans[] = new int[2];
        int sumA = 0, sumB = 0;
        for (int x: aliceSizes)
            sumA += x;
        for (int x: bobSizes)
            sumB += x;
        int diff = (sumA-sumB)/2;
        System.out.println(diff);
        HashSet<Integer> bob = new HashSet<Integer>();
        for (int x: bobSizes)
            bob.add(x);
        for (int x: aliceSizes) {
            if (bob.contains(x-diff)) {
                ans[0] = x;
                ans[1] = x-diff;
            }
        }
        return ans;
    }
}