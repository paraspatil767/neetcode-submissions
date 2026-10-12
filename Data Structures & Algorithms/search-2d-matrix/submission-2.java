class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        
        int low=0;
        int high= row*col-1;

        while(low<=high)
        {
          int mid= low+(high-low)/2;
          int rowm= mid/col;
          int colm=mid%col;

          int val=matrix[rowm][colm];

          if(target==val)
          {
            return true;
          }
          else if(target<val)
          {
            high=mid-1;
          }
          else
          {
            low=mid+1;
          }
        }
        return false;


    }
}
