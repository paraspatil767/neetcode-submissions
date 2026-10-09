class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[]prefix=new int[nums.length];
        int[]postfix=new int[nums.length];

        prefix[0]=1;
        postfix[nums.length-1]=1;

        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        for(int j=nums.length-2;j>=0;j--)
        {
            postfix[j]=postfix[j+1]*nums[j+1];
        }

        for(int i=0;i<nums.length;i++)
        {
            nums[i]=prefix[i]*postfix[i];
        }
        return nums;
    }
}  
