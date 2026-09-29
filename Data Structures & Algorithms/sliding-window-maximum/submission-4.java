class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans= new int[nums.length-k+1];

        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->
        {
            return Integer.compare(b[1],a[1]);
        });

        int start=0;
        for(int j=0;j<nums.length;j++)
        {
            pq.offer(new int[]{j,nums[j]});
            if(j-start+1==k)
            {
                while(pq.peek()[0]<start)
                {
                    pq.poll();
                   
                }
                ans[start++]=pq.peek()[1];
            }
        }

        return ans;
    }
}
