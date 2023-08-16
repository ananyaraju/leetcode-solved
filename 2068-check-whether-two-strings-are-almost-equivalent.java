class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for (char c: word1.toCharArray())
            freq1[c-'a']++;
        for (char c: word2.toCharArray())
            freq2[c-'a']++;
        for (int i=0; i<word1.length(); i++) {
            int c = word1.charAt(i) - 'a';
            if (Math.abs(freq1[c] - freq2[c]) > 3)
                return false;
        }
        for (int i=0; i<word2.length(); i++) {
            int c = word2.charAt(i) - 'a';
            if (Math.abs(freq1[c] - freq2[c]) > 3)
                return false;
        }
        return true;
    }
}