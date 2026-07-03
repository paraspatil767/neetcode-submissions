class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> map= new HashMap<>();

        for( int num : nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));

        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {

            if(pq.size()<k)
            {
                pq.offer(new int[]{entry.getKey(),entry.getValue()});
            }
            else if(pq.peek()[1]< entry.getValue())
            {
                pq.poll();
                pq.offer(new int[]{entry.getKey(),entry.getValue()});
            }
        }
        int[] ans= new int[k];
        int i=0;
        while(!pq.isEmpty())
        {
            ans[i++]=pq.poll()[0];
        }
        return ans;



      
    }
}
