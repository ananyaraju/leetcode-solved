class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num%2 == 0) {
                num = num/2;
                count++;
            }
            else {
                num--;
                count++;
            }
        }
        return count;
    }
}

class Solution {
    public int numberOfSteps(int num) {
        int dp[] = new int[num+1];
        for (int i=1; i<dp.length; i++) {
            dp[i] = dp[i-1] + 1;
            if (i%2 == 0) {
                dp[i] = Math.min(dp[i], dp[i/2]+1);
            }
        }
        return dp[num];
    }
}