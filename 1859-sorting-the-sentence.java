class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        HashMap<Integer, String> seq = new HashMap<>();
        for (String w: words) {
            seq.put((int)w.charAt(w.length()-1), w.substring(0, w.length()-1));
        }
        StringBuilder ans = new StringBuilder();
        Iterator i = seq.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry<Integer, String> e = (Map.Entry<Integer, String>)i.next();
            ans.append(e.getValue()); ans.append(" ");
        }
        return ans.toString().trim();
    }
}