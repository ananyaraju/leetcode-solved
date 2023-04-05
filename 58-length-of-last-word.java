class Solution {
    public int lengthOfLastWord(String s) {
        String words[] = s.split(" ");
        String ans = words[words.length-1].trim();
        return ans.length();
    }
}