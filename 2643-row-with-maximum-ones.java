class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int a[] = new int[2];
        int max = 0;
        for (int i=0; i<mat.length; i++) {
            int ones = 0;
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] == 1)
                    ones++;
            }
            if (ones > max) {
                max = ones;
                a[0] = i; a[1] = max;
            }
        }
        return a;
    }
}