class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<Character>(
            Arrays.asList('a','e','i','o','u','A','E','I','O','U')
        );
        char ans[] = s.toCharArray();
        int start = 0, end = s.length()-1;
        while (start < end) {
            while (start<s.length() && !vowels.contains(ans[start])) {
                start++;
            }
            while (end>=0 && !vowels.contains(ans[end])) {
                end--;
            }
            if (start < end) {
                char temp = ans[start];
                ans[start] = ans[end];
                ans[end] = temp;
                start++; end--;
            }
        }
        return new String(ans);
    }
}