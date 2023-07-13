class Solution {
    public int minimizedStringLength(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for (char c: s.toCharArray()) {
            if (!set.contains(c))
                set.add(c);
        }
        return set.size();
    }
}