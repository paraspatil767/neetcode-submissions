class Solution {
    public int maxArea(int[] heights) {
        
        int i=0,j=heights.length-1;

        int maxWater=0;
            int currentHold= 0;

        while(i<j)
        {
           int maxHeight=Math.min(heights[i],heights[j]);
           maxWater=Math.max(maxWater,maxHeight*(j-i));

           while(i<j && heights[i]<=maxHeight)
           {
            i++;
           } 
           while(i<j && heights[j]<=maxHeight)
           {
            j--;
           } 
        }
        return maxWater;
    }
}
