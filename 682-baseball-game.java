class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String s: operations) {
            if (s.equals("+")) {
                int a = st.pop();
                int newRecord = a + st.peek();
                st.push(a);
                st.push(newRecord);
            }
            else if (s.equals("C")) {
                st.pop();
            }
            else if (s.equals("D")) {
                st.push(st.peek()*2);
            }
            else {
                st.push(Integer.valueOf(s));
            }
        }
        int ans = 0;
        for (int x: st)
            ans += x;
        return ans;
    }
}