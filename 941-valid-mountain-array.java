class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean flag = true;
        if (arr.length==1) return false;
        if (arr[1] <= arr[0]) return false;
        int peak = 0;
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] == arr[i+1]) return false;
            if (arr[i+1] < arr[i]) {
                peak = i;
                break;
            }
        }
        for (int i=peak; i<arr.length-1; i++) {
            if (arr[i] <= arr[i+1])
                flag = false;
        }
        return flag;
    }
}