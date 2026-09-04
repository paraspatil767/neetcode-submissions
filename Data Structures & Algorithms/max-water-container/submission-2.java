class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right= heights.length-1;
        int max=0;

        while(left<right)
        {
            int height= Math.min(heights[left],heights[right]);
            int area= height*(right-left);

            max=Math.max(area,max);

            while(left<right && heights[left]<=height)
            {
                left++;
            }
            while(left<right && heights[right]<=height)
            {
                right--;
            }
        }
        return max;
    }
}
