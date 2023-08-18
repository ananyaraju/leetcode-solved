class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n%2 == 0) {
            sb.append("a".repeat(n-1));
            sb.append("r");
        }
        else
            sb.append("a".repeat(n));
        return sb.toString();
    }
}