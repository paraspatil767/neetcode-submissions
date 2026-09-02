class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> dq= new PriorityQueue<>((a,b)->{
            return a[1]-b[1];
        });
        Map<Integer,Integer> map= new HashMap<>();
        for(int num: nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        map.forEach((key,v)->{
            dq.offer(new int[]{key,v});
            if(dq.size()>k)
            {
                dq.poll();
            }
        });
        int [] arr= new int[dq.size()];
        int i=0;
        while(dq.size()>0)
        {
            arr[i++]=dq.poll()[0];
        }
        return arr;
    }
}
