class Solution {
    public boolean isValidSudoku(char[][] board) {
        int ROW= board.length;
        int COL= board[0].length;

        Set set= new HashSet();

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char number= board[i][j];
                if(number!='.')
                {
                    if(!set.add(number+" in row"+i)|| !set.add(number+" in column "+j)|| !set.add(number+" in subMatrix"+i/3+"-"+j/3))
                    {
                        return false;
                    }
                }
            }
        }
              
        return true;
    }
}
