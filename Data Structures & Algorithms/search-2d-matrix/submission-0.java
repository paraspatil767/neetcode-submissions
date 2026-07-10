class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for (int i=0;i<matrix.length;i++)
        {
            int len=matrix[i].length;
            if(matrix[i][0]<=target&& target<=matrix[i][len-1])
            {
                int low=0;
                int high=len-1;
                while(low<=high)
                {
                    int mid= low+(high-low)/2;
                    int val=matrix[i][mid];
                    if(target==val)
                    {
                        return true;
                    }
                    else if( target> val)
                    {
                        low=mid+1;
                    }
                    else
                    {
                        high=mid-1;
                    }
                }
            }
            else
            {
                continue;
            }
        }
        return false;
    }
}
