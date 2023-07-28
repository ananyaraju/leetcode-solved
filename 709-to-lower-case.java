class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()) {
            char x = c;
            if (c >= 'A' && c <= 'Z')
                x = (char)(c + 32);
            sb.append(x);
        }
        return sb.toString();
    }
}