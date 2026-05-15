class Solution {
    public int trap(int[] height) {
    
    int i=0,j=height.length-1;

    int trappedWater=0;
    int maxLeft=height[i];
    int maxRight=height[j];
    while(i<j)
    {
        if(maxLeft<maxRight)
        {
            i++;
            if(height[i]>maxLeft)
            {
                maxLeft=height[i];
            }
            else
            {
                trappedWater+=maxLeft-height[i];
            }
        }
        else
        {
            j--;
            if(height[j]>maxRight)
            {
                maxRight=height[j];
            }
            else
            {
                trappedWater+=maxRight-height[j];
            }
        }

    }
    return trappedWater;

}
}
