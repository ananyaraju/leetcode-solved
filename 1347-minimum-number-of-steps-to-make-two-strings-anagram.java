class Solution {
    public int minSteps(String s, String t) {
        int ans = 0;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char c: s.toCharArray())
            map1.put(c, map1.getOrDefault(c, 0)+1);
        for (char c: t.toCharArray())
            map2.put(c, map2.getOrDefault(c, 0)+1);
        for (char c: t.toCharArray()) {
            if (!map1.containsKey(c)) {
                map1.put(c, map2.get(c));
                ans += map2.get(c);
                continue;
            }
            if (map2.get(c) - map1.get(c) > 0)
                ans += map2.get(c) - map1.get(c);
                map1.put(c, map2.get(c));
        }
        return ans;
    }
}

class Solution {
    public int minSteps(String s, String t) {
        int ans = 0;
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for (char c: s.toCharArray())
            freq1[c - 'a']++;
        for (char c: t.toCharArray())
            freq2[c - 'a']++;
        for (char c: t.toCharArray()) {
            if (freq2[c-'a'] - freq1[c-'a'] > 0) {
                ans += freq2[c-'a'] - freq1[c-'a'];
                freq1[c-'a'] = freq2[c-'a'];
            }
        }
        return ans;
    }
}