class Solution {
    public int vowels(String s, ArrayList<Character> v) {
        int count = 0;
        for (char c: s.toCharArray())
            if (v.contains(c))
                count++;
        return count;
    }
    public boolean halvesAreAlike(String s) {
        ArrayList<Character> v = new ArrayList<>();
        List<Character> chars = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        v.addAll(chars);
        String half1 = s.substring(0, s.length()/2);
        String half2 = s.substring(s.length()/2, s.length());
        return (vowels(half1, v) == vowels(half2, v));
    }
}