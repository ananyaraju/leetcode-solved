class Solution {
    public boolean squareIsWhite(String coordinates) {
        int num = (coordinates.charAt(0) - '0') + (coordinates.charAt(1) - '0');
        return num % 2 != 0;
    }
}