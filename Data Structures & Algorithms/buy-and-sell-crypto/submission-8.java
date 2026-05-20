class Solution {
    public int maxProfit(int[] prices) {

        int maxPrice=0;
        int minPrice=Integer.MAX_VALUE;
        for(int num:prices)
        {
            if(num<minPrice)
            {
                minPrice=num;
            }
            if(maxPrice<num-minPrice)
            {
                maxPrice=num-minPrice;
            }
        }
        return maxPrice;
    }
}
