class Solution {
    public List<String> cellsInRange(String s) {
        int c1 = (int)s.charAt(0), c2 = (int)s.charAt(3);
        int range1 = s.charAt(1) - '0', range2 = s.charAt(4) - '0';
        List<String> list = new ArrayList<>();
        for (int alph = c1; alph <= c2; alph++) {
            for (int i = range1; i <= range2; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append((char)alph);
                sb.append(i);
                list.add(sb.toString());
            }
        }
        return list;
    }
}