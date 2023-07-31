class Solution {
    public static boolean isPalindrome(String word) {
        int p1 = 0, p2 = word.length()-1;
        while (p1 <= p2) {
            if (word.charAt(p1) == word.charAt(p2)) {
                p1++; p2--;
            }
            else
                return false;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for (String word: words)
            if (isPalindrome(word) == true)
                return word;
        return "";
    }
}