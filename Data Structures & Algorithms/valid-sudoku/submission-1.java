class Solution {
    public boolean isValidSudoku(char[][] board) {
        int ROW= board.length;
        int COL= board[0].length;

        Set<Character> set= new HashSet<>();

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    continue;
                }
                else
                {
                if(set.contains(board[i][j]))
                {
                    return false;
                }
                set.add(board[i][j]);
                }
            }
            set.clear();
        }
        for(int j=0;j<9;j++)
        {
             for(int i=0;i<9;i++)
            {
                if(board[i][j]=='.')
                {
                    continue;
                }
                else
                {
                if(set.contains(board[i][j]))
                {
                    return false;
                }
                set.add(board[i][j]);
                }
            }
            set.clear();
        }
        set.clear();
        for(int sq=0;sq<9;sq++)
        {
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    int row= (sq/3)*3+i;
                    int col= (sq%3)*3+j;
                    if(board[row][col]=='.') continue;
                    if(set.contains(board[row][col])) return false;
                    set.add(board[row][col]);
                }
            }
            set.clear();
        }

        return true;
    }
}
