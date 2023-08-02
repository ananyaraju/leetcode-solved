class Solution {
    public double trimMean(int[] arr) {
        double sum = 0;
        double border = 0.05 * arr.length;
        Arrays.sort(arr);
        for (int i=(int)border; i<arr.length-border; i++) {
            sum += arr[i];
        }
        return sum/(arr.length-2*border);
    }
}