class Solution {
    public int findNext(int element, int[] nums2) {
        int i = 0;
        while (i < nums2.length && nums2[i] != element)
            i++;
        // if (i == nums2.length) return -1;
        for (int j=i; j<nums2.length; j++) {
            if (nums2[j] > element)
                return nums2[j];
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        for (int i=0; i<ans.length; i++) {
            ans[i] = findNext(nums1[i], nums2);
        }
        return ans;
    }
}