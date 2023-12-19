// Beats 100%
class Solution {
    public String makeSmallestPalindrome(String s) {
        char c[] = s.toCharArray();
        int i = 0, j = c.length - 1;
        while (i < j) {
            c[i] = (char)Math.min(c[i], c[j]);
            c[j]= c[i];
            i++;
            j--;
        }
        return new String(c);
        
    }
}

// Beats 34%
class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        int i = 0, j = c.length - 1;
        while (i <= j) {
            if (c[i] < c[j])
                c[j] = c[i];
            else
                c[i] = c[j];
            i++; j--;
        }
        for (char ch: c)
            sb.append(ch);
        return sb.toString();
    }
}