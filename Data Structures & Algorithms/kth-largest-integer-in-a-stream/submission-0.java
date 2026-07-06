class KthLargest {
    private PriorityQueue<Integer> pq;
    private int K;
    public KthLargest(int k, int[] nums) {
        pq=new PriorityQueue<>((a,b)->Integer.compare(a,b));
        K=k;

        for(int num:nums)
        {
            pq.offer(num);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
    }
    
    public int add(int val) {
        pq.offer(val);
        if(pq.size()>K)
        {
            pq.poll();
        }
        return pq.peek();
    }
}
