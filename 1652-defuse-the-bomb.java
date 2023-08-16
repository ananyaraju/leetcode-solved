class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int ans[] = new int[n];
        if (k == 0)
            return new int[n];
        if (k < 0) {
            k = Math.abs(k);
            for (int i=0; i<n; i++)
                for (int j=1; j<=k; j++)
                    ans[i] += code[(n+i-j)%n];
        }
        else if (k > 0)
            for (int i=0; i<n; i++)
                for (int j=1; j<=k; j++)
                    ans[i] += code[(i+j)%n];
        return ans;
    }
}