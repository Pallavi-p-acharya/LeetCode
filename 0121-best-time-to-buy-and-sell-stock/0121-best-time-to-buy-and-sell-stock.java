class Solution {
    public int maxProfit(int[] prices) {
        int smallest=prices[0],largest=prices[0],profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<smallest){
                smallest=prices[i];
                largest=prices[i];
            }else if(prices[i]>largest) {
                largest=prices[i];
                profit =Math.max(profit,largest-smallest);
            }
        }
        return profit;
    }
}