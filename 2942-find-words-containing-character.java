class Solution {
    public boolean hasLetter(char x, String word) {
        for (int i=0; i<word.length(); i++)
            if (x == word.charAt(i))
                return true;
        return false;
    }
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<Integer>();
        for (int i=0; i<words.length; i++) {
            String w = words[i];
            if (hasLetter(x, w))
                ans.add(i);
        }
        return ans;
    }
}