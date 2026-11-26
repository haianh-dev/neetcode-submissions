class Solution {
    public int maxProfit(int[] prices) {
        int left = Integer.MAX_VALUE;
        int right = 0;
        int profit = 0;
        while (right < prices.length) {
            if (prices[right] < left) left = prices[right];
            else profit = Math.max(profit, prices[right] - left);
            right++;
        }
        return profit;
    }
}