class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length)
            return false;
        for (int i=0; i<pattern.length(); i++) {
            char p = pattern.charAt(i);
            String w = words[i];
            if (!map.containsKey(p) && !map.containsValue(w))
                map.put(p, w);
            if (!map.containsKey(p) && map.containsValue(w))
                return false;
            else if (map.containsKey(p)) {
                if (!map.get(p).equals(w))
                    return false;
            }
        }
        return true;
    }
}