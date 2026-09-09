class Solution {
    public int[] productExceptSelf(int[] nums) {

        // int[] pre= new int[nums.length];
        // int[] post=new int[nums.length];
        int[] ans=new int[nums.length];

        ans[0]=1;
       

        for(int i=1;i<nums.length;i++)
        {
            ans[i]=nums[i-1]*ans[i-1];
        }
        int postFix=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[i]*=postFix;
            postFix*=nums[i];
        }


        // for(int i=0;i<nums.length;i++)
        // {
        //     ans[i]=pre[i]*post[i];
        // }
        return ans;

        
    }
}  
