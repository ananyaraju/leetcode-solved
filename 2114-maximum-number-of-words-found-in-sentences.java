import java.util.*;
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String str: sentences) {
            max = Math.max(max, new StringTokenizer(str).countTokens());
        }
        return max;
    }
}