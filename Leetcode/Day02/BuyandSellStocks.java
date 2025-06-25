//leetcode solution for buy and sell stock
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];  // update buying day
            } else {
                int profit = prices[i] - minPrice;  // sell today
                if (profit > maxProfit) {
                    maxProfit = profit;  // update best profit
                }
            }
        }
        return maxProfit;
    }
}
