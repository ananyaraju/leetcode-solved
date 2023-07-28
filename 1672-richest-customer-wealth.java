class Solution {
    public int maximumWealth(int[][] accounts) {
        int temp = 0;
        int wealth[] = new int[accounts.length];
        for (int i=0; i<accounts.length; i++) {
            for (int j=0; j<accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            wealth[i] = temp;
            temp = 0;
        }
        Arrays.sort(wealth);
        return wealth[wealth.length-1];
    }
}

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        for (int i=0; i<accounts.length; i++) {
            for (int j=0; j<accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(max, sum);
            sum = 0;
        }
        return max;
    }
}