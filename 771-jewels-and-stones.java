class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int have = 0;
        HashMap<Character, Integer> s = new HashMap<Character, Integer>();
        HashSet<Character> j = new HashSet<Character>();
        for (char c: stones.toCharArray())
            s.put(c, s.getOrDefault(c,0)+1);
        for (char c: jewels.toCharArray()) {
            if (s.containsKey(c))
                have += s.get(c);
        }
        return have;
    }
}