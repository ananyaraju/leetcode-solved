class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> map = new HashSet<Character>();
        for (char c: sentence.toCharArray())
            if (!map.contains(c))
                map.add(c);
        if (map.size() != 26)
            return false;
        return true;
    }
}