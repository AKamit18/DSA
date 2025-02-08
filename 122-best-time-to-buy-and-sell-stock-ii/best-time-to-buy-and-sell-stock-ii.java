class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        // Traverse the array, adding the profit whenever there's an increase in price
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];  // Buy at prices[i-1], sell at prices[i]
            }
        }
        
        return maxProfit;
    
    
        
    }
}