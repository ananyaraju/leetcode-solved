class Solution {
    public int findTheWinner(int n, int k) {
        boolean dead[] = new boolean[n];
        int killed = 0;
        int curr = 0;
        int counter = 1;
        while (killed < n-1) {
            if (!dead[curr] && counter < k) {
                counter++;
            }
            else if (!dead[curr]) {
                dead[curr] = true;
                counter = 1;
                killed++;
            }
            curr = (curr + 1) % n;
        }
        for ( int i=0; i<n; i++)
            if (!dead[i])
                return i+1;
        return 0;
    }
}