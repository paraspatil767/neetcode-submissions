class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set= new HashSet<>();

        for(int num : nums)
        {
            int n=num;
           set.add(n); 
        }
        int max=0;
        for(int num:nums)
        {
            int count=1;
            if(set.contains(num-1))
            {
                continue;
            }
            while(set.contains(++num))
            {
                count++;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
