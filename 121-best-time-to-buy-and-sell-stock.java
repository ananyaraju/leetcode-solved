// Valley Peak
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int curr = prices[0];
        for (int i=1; i<prices.length; i++) {
            curr = Math.min(prices[i], curr);
            max = Math.max(max, prices[i]-curr);
        }
        return max;
    }
}

// Stacks
class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> st = new Stack<Integer>();
        int max = 0;
        int profit;
        st.push(prices[0]);
        for (int i=1; i<prices.length; i++) {
            if (prices[i] <= st.peek()) {
                st.push(prices[i]);
            }
            else {
                profit = prices[i] - st.peek();
                if (profit > max) {
                    max = profit;
                }
            }
        }
        return max;
    }
}