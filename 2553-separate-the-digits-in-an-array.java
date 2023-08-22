class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();
        for (int x: nums)
            sb.append(x);
        int ans[] = new int[sb.length()];
        for (int i=0; i<sb.length(); i++) {
            ans[i] = sb.charAt(i) - '0';
        }
        return ans;
    }
}

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> digits = new ArrayList<>();
        for (int i=0; i<nums.length; i++) {
            String n = nums[i] + "";
            for (int j=0; j<n.length(); j++)
                digits.add(Integer.parseInt(n.charAt(j)+""));
        }
        int[] ans = new int[digits.size()];
        for (int i=0; i<digits.size(); i++)
            ans[i] = digits.get(i);
        return ans;
    }
}