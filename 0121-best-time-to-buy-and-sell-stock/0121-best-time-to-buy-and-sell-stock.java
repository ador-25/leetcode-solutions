class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int start = prices[0];
        for (int i=1;i<prices.length;i++){
            int currentProfit = prices[i]-start;
            if (currentProfit<=0){
                start = prices[i];
                continue;
            }
            profit = Math.max(profit,currentProfit);
        }
        return profit;
    }
}