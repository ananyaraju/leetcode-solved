class Solution {
    public int maxDepth(String s) {
        int max = 0;
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c=='(') {
                stack.push(c);
                if (stack.size() > max)
                    max = stack.size();
            }
            else if (c==')') {
                stack.pop();
            }
        }
        return max;
    }
}