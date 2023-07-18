class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allow = new HashSet<>();
        for (char x: allowed.toCharArray())
            allow.add(x); 
        int ans = 0;
        for (String w: words) {
            int index = 0;
            for (char c: w.toCharArray()) {
                if (!allow.contains(c))
                    break;
                index++;
            }
            if (index == w.length())
                ans++;
        }
        return ans;
    }
}