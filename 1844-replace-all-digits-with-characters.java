class Solution {
    public static char shift(char c, int i) {
        char ascii = (char)((int)c + i);
        return ascii;
    }
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i=1; i<s.length(); i+=2) {
            char c = sb.charAt(i);
            sb.setCharAt(i, shift(s.charAt(i-1), s.charAt(i)-'0'));
        }
        return sb.toString();
    }
}