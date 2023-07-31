class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w: words) {
            StringBuffer sbuff = new StringBuffer(w);
            sb.append(sbuff.reverse()+" ");
        }
        return sb.toString().trim();
    }
}