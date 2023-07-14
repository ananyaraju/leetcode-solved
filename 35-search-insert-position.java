// Binary Tree
class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length-1;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return lo;
    }
}

// Brute Force
class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        while (nums[i]<target) {
            i++;
            if (i == nums.length) {
                break;
            }
        }
        return i;
    }
}