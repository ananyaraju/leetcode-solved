class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> broken = new HashSet<>();
        for (char c: brokenLetters.toCharArray())
            broken.add(c);
        String words[] = text.split(" ");
        int count = words.length;
        for (String word: words) {
            for (char x: word.toCharArray()) {
                if (broken.contains(x)) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}