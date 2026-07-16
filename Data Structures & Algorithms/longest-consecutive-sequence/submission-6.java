class Solution {
    public int longestConsecutive(int[] nums) {

       Set<Integer> set= new HashSet<>();
        for(int num: nums)
        {
            set.add(num);
        }

        int count=0;
        int max=0;

        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i]-1))
            {
                continue;
            }
            else
            {
                int num=nums[i];
                count=1;
                while(set.contains(num+1))
                {
                    count++;
                    num++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
        
    }
}
