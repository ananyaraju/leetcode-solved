class Solution {
    public int[] diStringMatch(String s) {
        int low = 0, high = s.length();
        int perm[] = new int[s.length() + 1];
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'I')
                perm[i] = low++;
            if (s.charAt(i) == 'D')
                perm[i] = high--;
        }
        perm[s.length()] = low;
        return perm;
    }
}