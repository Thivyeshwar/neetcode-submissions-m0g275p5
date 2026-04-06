class Solution {
    public int maxProfit(int[] prices) {
        
        int maxP = 0;

        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){

                int sell = prices[j] - prices[i];
                maxP = Math.max(maxP,sell);
            }
        }
        return maxP;
    }
}
