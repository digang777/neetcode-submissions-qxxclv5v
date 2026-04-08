class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1, mP = 0;

        while (r <= prices.length - 1) {
            
            if(prices[l] <= prices[r]){
                if (mP < prices[r] - prices[l]) {
                    mP = prices[r] - prices[l];
                }
                r++;
            } else  {
                l=r;
                r=l+1;
            }

        }
        return mP;
    }
}
