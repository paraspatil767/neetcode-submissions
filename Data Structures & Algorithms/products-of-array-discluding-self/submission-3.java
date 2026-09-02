class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int []preFix= new int[n];
        int[]postFix= new int[n];
        int []ans= new int[n];

        preFix[0]=1;
        postFix[n-1]=1;

        for(int i=1;i<n;i++)
        {
            preFix[i]=nums[i-1]* preFix[i-1];
        }

        for(int i=n-2;i>=0;i--)
        {
            postFix[i]=nums[i+1]* postFix[i+1];
        }

        for(int i=0;i<n;i++)
        {
            ans[i]=preFix[i]*postFix[i];
        }
        return ans;
    }
}  
