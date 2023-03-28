class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        HashMap<Character,Integer> mag = new HashMap<>();
        for (char c: magazine.toCharArray())
            mag.put(c, mag.getOrDefault(c,0)+1);

        HashMap<Character,Integer> note = new HashMap<>();
        for (char c: ransomNote.toCharArray())
            mag.put(c, mag.getOrDefault(c,0)-1);
        
        for (int count: mag.values()) {
            if (count < 0)
                return false;
        }
        return true;

    }
}