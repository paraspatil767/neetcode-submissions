class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int max=Arrays.stream(piles).max().getAsInt();
        int low=1;

        int minTime=0;
        while(low<=max)
        {
            int mid=(low+(max-low)/2);

            int time=eatenTime(piles,mid);
            if(time<=h)
            {
                minTime=mid;
                max=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return minTime;
    }
    public int  eatenTime(int[] piles,int perHour)
    {
        int total=0;
        for(int num: piles)
        {
            total+=(num+perHour-1)/perHour;
        }
        return total;
    }
}
