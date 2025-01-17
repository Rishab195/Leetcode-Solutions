class Solution {
    public int maxProfit(int[] prices) {
        // int buyPrice=prices[0];
        // int profit=0;
        // for(int i=1;i<prices.length;i++){
        //   if(buyPrice>prices[i])
        //     buyPrice=prices[i];
        //     profit=Math.max(profit,prices[i]-buyPrice);  
        // }
        // return profit;
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            minPrice=Math.min(minPrice,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-minPrice);
        }
        return maxProfit;
    }
}