class Solution {
    public int findKthPositive(int[] arr, int k) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi-lo)/2;
            if (arr[mid]-mid-1 >= k)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return lo + k;
    }
}