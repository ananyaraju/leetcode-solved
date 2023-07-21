class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        int occurrence = map.get(s.charAt(0));
        for (char c: map.keySet())
            if (map.get(c) != occurrence)
                return false;
        return true;
    }
}