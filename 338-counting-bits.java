class Solution {
    public int countOnes(String n) {
        int count = 0;
        for (int i=0; i<n.length(); i++) {
            if (n.charAt(i) == '1')
                count++;
        }
        return count;
    }
    public int[] countBits(int n) {
        if (n == 0)
            return new int[] {0};
        int ans[] = new int[n+1];
        ans[0] = 0; ans[1] = 1;
        for (int i=2; i<=n; i++) {
            String bin = Integer.toBinaryString(i);
            ans[i] = countOnes(bin);
        }
        return ans;
    }
}