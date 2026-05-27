class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1, p = 0;

        while (r <= prices.length - 1) {
            if (prices[l] <= prices[r]) {
                if (p < prices[r] - prices[l]) {
                    p = prices[r] - prices[l];
                }
                r++;
            } else {
                l = r;
                r = l + 1;
            }
        }
        return p;
    }
}
