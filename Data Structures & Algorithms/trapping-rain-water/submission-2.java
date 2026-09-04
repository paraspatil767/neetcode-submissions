class Solution {
    public int trap(int[] height) {
        int left=0;
        int lTrap=height[left];

        int right=height.length-1;
        int rTrap=height[right];

        int trap=0;

        while(left<right)
        {
            if(lTrap<rTrap)
            {
                left++;
                if(lTrap<height[left])
                {
                    lTrap=height[left];
                }
                else
                {
                    trap+=lTrap-height[left];
                }
            }
            else
            {
                right--;
                if(rTrap<height[right])
                {
                    rTrap=height[right];

                }
                else
                {
                    trap+=rTrap-height[right];
                }
            }
        }
        return trap;
    }
}
