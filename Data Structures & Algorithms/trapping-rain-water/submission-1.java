class Solution {
    public int trap(int[] height) {
    
        int start=0;
        int end=height.length-1;
        int maxStart=height[start];
        int maxEnd=height[end];
        int count=0;

        while(end>start)
        {
            if(maxStart>maxEnd)
            {
                end--;

                if(maxEnd<height[end])
                {
                    maxEnd=height[end];
                }
                else
                {
                    count+=maxEnd-height[end];
                }
            }
            else
            {
                start++;
                if(maxStart<height[start])
                {
                    maxStart=height[start];
                }
                else
                {
                    count+=maxStart-height[start];
                }
            }
        }
        return count;
}
}
