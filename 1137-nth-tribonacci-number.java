class Solution {
    public int tribonacci(int n) {
        if (n<3)
            return (n > 0) ? 1 : 0;
        int ans = 0;
        int t0 = 0, t1 = 1, t2 = 1;
        for (int i=3; i<=n; i++) {
            ans = t0 + t1 + t2;
            t0 = t1; t1 = t2; t2 = ans;
        }
        return ans;
    }
}