class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = new String[] { ".-","-...","-.-.","-..",".","..-.",
            "--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",
            ".-.","...","-","..-","...-",".--","-..-","-.--","--.." };
        HashSet<String> set = new HashSet<>();
        for (String w: words) {
            StringBuilder sb = new StringBuilder();
            for (char c: w.toCharArray()) {
                sb.append(morse[(int)c-97]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}