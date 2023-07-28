class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        String ans = "";
        for (char c: s.toCharArray()) {
            if (c=='(') {
                if (!stack.isEmpty())
                    ans += c;
                stack.push(c);
            }
            else if (c==')') {
                stack.pop();
                if (!stack.isEmpty()) {
                    ans += c;
                }
            }
        }
        return ans;
    }
}