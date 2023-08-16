class Solution {
    public boolean checkDistances(String s, int[] distance) {
        int firstOcc[] = new int[26];
        Arrays.fill(firstOcc, -1);
        int secondOcc[] = new int[26];
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (firstOcc[c - 'a'] == -1)
                firstOcc[c - 'a'] = i;
            else
                secondOcc[c - 'a'] = i;
        }
        for (int i=0; i<26; i++) {
            if (firstOcc[i] != -1 && secondOcc[i] - firstOcc[i] - 1 != distance[i])
                return false;
        }
        return true;
    }
}