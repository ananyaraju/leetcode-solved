class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() % k != 0)
            sb.append(fill);
        System.out.println(sb);
        List<String> ans = new ArrayList<>();
        for (int i=0; i<sb.length(); i+=k) {
            ans.add(sb.substring(i, i+k));
        }
        String[] divide = new String[ans.size()];
        for (int i=0; i<ans.size(); i++)
            divide[i] = ans.get(i);
        return divide;
    }
}