class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length())
            return false;
        int wptr = 0; int sptr = 0;
        while (wptr < words.size() && sptr < s.length()) {
            if (words.get(wptr).charAt(0) != s.charAt(sptr))
                return false;
            wptr++; sptr++;
        }
        return true;
    }
}