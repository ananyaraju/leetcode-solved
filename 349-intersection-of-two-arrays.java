class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        HashSet<Integer> n2 = new HashSet<>();
        for (int x: nums1)
            n1.add(x);
        for (int x: nums2)
            n2.add(x);
        n1.retainAll(n2);
        int arr[] = new int[n1.size()];
        int index = 0;
        for (int x: n1)
            arr[index++] = x;
        return arr;
    }
}