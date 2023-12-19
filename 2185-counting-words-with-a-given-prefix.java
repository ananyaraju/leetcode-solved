// 0ms - beats 100%
class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word: words)
            if (word.startsWith(pref))
                count++;
        return count;
    }
}

// 1ms - beats 50%
class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        int len = pref.length();
        for (String word: words) {
            if (word.length() >= len && word.substring(0, len).equals(pref))
                ans++;
        }
        return ans;
    }
}