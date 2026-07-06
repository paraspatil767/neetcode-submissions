class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->Integer.compare(b,a));

        for(int num: stones)
        {
            pq.offer(num);
        }

        while(pq.size()>1)
        {
            int stone1= pq.poll();
            int stone2=pq.poll();
            int smash=stone1-stone2;
            if(smash>0)
            {
                pq.offer(smash);
            }
        }
        return pq.size()==0?0:pq.poll();
    }
}
