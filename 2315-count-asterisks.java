class Solution {
    public int countAsterisks(String s) {
        boolean hasAsterisk = false;
        Stack<Character> st = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '|') {
                hasAsterisk = !hasAsterisk;
                if (hasAsterisk == false) {
                    while (st.peek() != '|')
                        st.pop();
                    st.pop();
                }
                else
                    st.push(c);
            }
            if (c == '*')
                st.push(c);
        }
        return st.size();
    }
}