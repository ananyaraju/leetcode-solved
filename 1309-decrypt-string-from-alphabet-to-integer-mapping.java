class Solution {
    public String freqAlphabets(String s) {
        int ptr = 0;
        StringBuilder sb;
        StringBuilder decrypt = new StringBuilder("");
        while (ptr < s.length()-2) {
            char c = s.charAt(ptr+2);
            if (c == '#') {
                sb = new StringBuilder(s.substring(ptr, ptr+2));
                int x = Integer.parseInt(sb.toString()) + 96;
                char ch = (char)x;
                decrypt.append(ch);
                sb.setLength(0);
                ptr += 3;

            }
            else {
                int y = s.charAt(ptr) - '0' + 96;
                char ch2 = (char)y;
                decrypt.append(ch2);
                ptr++;
            }
        }
        while (ptr < s.length()) {
            int y = s.charAt(ptr) - '0' + 96;
            char ch2 = (char)y;
            decrypt.append(ch2);
            ptr++;
        }
        return decrypt.toString();
    }
}