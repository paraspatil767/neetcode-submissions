class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->{
            return Integer.compare(b[0],a[0]);
        });

        int[] ans= new int[nums.length-k+1];
        int start=0;
        for(int i=0;i<nums.length;i++)
        {
            pq.offer(new int[]{nums[i],i});

            if(i-start+1==k)
            {
                while(pq.peek()[1]<start)
                {
                    pq.poll();
                }
                ans[start++]=pq.peek()[0];
            }

        }
        return ans;
    }
}
