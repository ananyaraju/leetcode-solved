class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> map = new HashSet<>();
        int count = 0;
        for (String w: words) {
            StringBuilder sb = new StringBuilder(w);
            if (!map.contains(sb.reverse().toString()))
                map.add(sb.reverse().toString());
            else
                count++;       
        }
        return count;
    }
}

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int pairs = 0;
        StringBuilder sb1, sb2;
        for (int i=0; i<words.length-1; i++) {
            for (int j=i+1; j<words.length; j++) {
                sb1 = new StringBuilder(words[i]);
                sb2 = new StringBuilder(words[j]);
                if (sb1.toString().equals(sb2.reverse().toString()))
                    pairs++;
            }
        }
        return pairs;
    }
}