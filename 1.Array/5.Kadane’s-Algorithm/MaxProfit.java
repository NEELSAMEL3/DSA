class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;

        int minPrice = prices[0]; // minimum price seen so far
        int maxProfit = 0;        // max profit so far

        for (int i = 1; i < prices.length; i++) {
            // If we sell at current price, what profit do we get?
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);

            // Update minimum price
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }
}