class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> map = new HashMap<>();
        String words1[] = s1.split(" ");
        String words2[] = s2.split(" ");
        for (String w: words1)
            map.put(w, map.getOrDefault(w, 0)+1);
        for (String w: words2)
            map.put(w, map.getOrDefault(w, 0)+1);
        List<String> ans = new LinkedList();
        for (String word: map.keySet())
            if (map.get(word) == 1)
                ans.add(word);
        return ans.toArray(new String[ans.size()]);
    }
}