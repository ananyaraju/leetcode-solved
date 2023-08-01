class Solution {
    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for (char c: columnTitle.toCharArray()) {
            int x = (int)c - 64;
            ans = ans * 26 + x;
        }
        return ans;
    }
}