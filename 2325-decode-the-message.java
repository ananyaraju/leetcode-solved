class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> keys = new HashMap<>();
        int alph = 97;
        for (char c: key.toCharArray()) {
            if (c == ' ')
                continue;
            if (!keys.containsKey(c)) {
                keys.put(c, (char)alph);
                alph++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c: message.toCharArray()) {
            if (c == ' ')
                sb.append(' ');
            else
                sb.append(keys.get(c));
        }
        return sb.toString();
    }
}