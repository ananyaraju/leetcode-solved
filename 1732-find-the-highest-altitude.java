class Solution {
    public int largestAltitude(int[] gain) {
        int alt[] = new int[gain.length+1];
        alt[0] = 0;
        for (int i=1; i<=gain.length; i++)
            alt[i] = alt[i-1] + gain[i-1];
        int ans = 0;
        for (int x: alt)
            ans = Math.max(ans, x);
        return ans;
    }
}