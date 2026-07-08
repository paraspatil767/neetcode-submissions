class Solution {
    public int[][] kClosest(int[][] points, int k) {
    PriorityQueue <int[]> pq= new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));

    for(int i=0;i<points.length;i++)
    {
        int x=points[i][0];
        int y=points[i][1];
        int distance=x*x+y*y;
        pq.offer(new int[]{distance,i});
    }
    int[][] ans=new int[k][2];
    int i=0;
    while(i<k)
    {
        
        ans[i]=points[pq.poll()[1]];
        i++;
    }
    return ans;



    }
}
