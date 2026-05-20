class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []product=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int pro=1;
            for(int j=0;j<nums.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                pro*=nums[j];
            }
            product[i]=pro;
        }
        return product;
    }
}  
