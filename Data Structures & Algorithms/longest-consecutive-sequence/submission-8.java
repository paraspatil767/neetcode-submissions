class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set= new HashSet<>();

        for(int num: nums)
        {
            set.add(num);
        }

        int max=0;

        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            int count=1;
            if(set.contains(num-1))
            {
                continue;
            }
            while(set.contains(num+1))
            {
                count++;
                num++;
            }
            max=Math.max(count,max);
            count=1;
        }
    return max;
    }
}
