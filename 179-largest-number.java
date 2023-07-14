class Solution {
    public class sorter implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            String a = s1 + s2;
            String b = s2 + s1;
            return b.compareTo(a);
        }
    }
    public String largestNumber(int[] nums) {
        String str[] = new String[nums.length];
        for (int i=0; i<nums.length; i++)
            str[i] = String.valueOf(nums[i]);
        Arrays.sort(str, new sorter());
        if (str[0].equals("0"))
            return "0";
        String ans = new String();
        for (int i=0; i<nums.length; i++) {
            ans += str[i];
        }
        return ans;
    }
}