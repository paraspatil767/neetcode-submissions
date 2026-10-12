class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxP=0;
        for(int num:prices)
        {
            maxP=Math.max(maxP,num-min);
            min=Math.min(min,num);
            
        }
        return maxP;
    }
}
