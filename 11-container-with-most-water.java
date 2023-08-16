class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int b = right-left;
            max = Math.max(max, h*b);
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}