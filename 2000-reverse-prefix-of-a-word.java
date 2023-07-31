class Solution {
    public String reversePrefix(String word, char ch) {
        int lastIndex = word.indexOf(ch);
        if (lastIndex == -1)
            return word;
        StringBuilder sb = new StringBuilder(word.substring(0, lastIndex+1));
        sb.reverse();
        sb.append(word.substring(lastIndex+1, word.length()));
        return sb.toString();
    }
}