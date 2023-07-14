class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int L[][] = new int[nums1.length+1][nums2.length+1];
        for (int i=0; i<nums1.length+1; i++) {
            for (int j=0; j<nums2.length+1; j++) {
                if (i==0 || j==0)
                    L[i][j] = 0;
                else if (nums1[i-1] == nums2[j-1])
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]);
            }
        }
        return L[nums1.length][nums2.length];
    }
}