class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    continue;
                }
                char num = board[i][j];

                String row = num + "row"+i;
                String column= num +"column"+ j;
                String boxes = num + "boxes"+(i/3)*3+(j/3);

                if(!seen.add(row)||!seen.add(column)||!seen.add(boxes))
                {
                    return false;
                }
            }
        }
        return true;
    }
}