class Solution {
    public int minimizedStringLength(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c: s.toCharArray()) {
            if (map.containsKey(c))
                map.put(c,map.get(c)+1);
            else
                map.put(c,1);
        }
        return map.size();
    }
}