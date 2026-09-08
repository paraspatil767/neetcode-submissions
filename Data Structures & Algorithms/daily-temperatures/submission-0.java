class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int []ans = new int[temp.length];

        for(int i=0;i<temp.length;i++)
        {
            for(int j=i+1;j<temp.length;j++)
            {
                if(temp[i]<temp[j])
                {
                    ans[i]=j-i;
                    break;
                }
            }
        }
        return ans;
    }
}
