class Solution {
    public int bitwiseComplement(int n) {
        int ans = 0;
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(s);
        for (int i=0; i<sb.length(); i++) {
            char c = sb.charAt(i);
            if (c == '1')
                sb.setCharAt(i, '0');
            else
                sb.setCharAt(i, '1');
        }
        for (char c: sb.toString().toCharArray()) {
            ans = ans*2 + (c-'0');
        }
        return ans;
    }
}