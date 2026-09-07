class Solution {
    public int maxProfit(int[] prices) {
        
        int maxP=0;
        int min=prices[0];

        for(int num: prices)
        {
            maxP=Math.max(maxP,num-min);
            min=Math.min(min,num);

        }
        return maxP;
    }
}
