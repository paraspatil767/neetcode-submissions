class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int [][] A= new int[nums.length][2];

    for(int i=0;i<nums.length;i++)
    {
        A[i][0]=nums[i];
        A[i][1]=i;
    }
        Arrays.sort(A,Comparator.comparingInt(a->a[0]));

        int i=0,j=nums.length-1;

        while(i<j)
        {
            if(A[i][0]+A[j][0]==target)
            {

                return new int[]{Math.min(A[i][1],A[j][1]),Math.max(A[i][1],A[j][1])};
            }
            else if((A[i][0]+A[j][0])>target)
            {
                j--;
            }
            else 
            {
                i++;
            }

        }
      
      return null;


    }
}
