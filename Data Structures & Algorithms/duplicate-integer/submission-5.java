class Solution {
    public boolean hasDuplicate(int[] nums) {
    //    return Arrays.stream(nums).distinct().count()< nums.length;

    Arrays.sort(nums);

    for(int i=0;i<nums.length-1;i++)
    {
        if(nums[i]==nums[i+1]) return true;
    }
    return false;
    }
    
}