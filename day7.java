class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean a=true,b=true,c=true;
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char current=board[i][j];
                if(board[i][j]=='.')
                {
                    continue;
                }
                else
                {
                    for(int k=j+1;k<9;k++)
                    {
                        if(current==board[i][k])
                        {
                            a=false;
                        }
                    }
                    for(int k=i+1;k<9;k++)
                    {
                        if(current==board[k][j])
                        {
                            b=false;
                        }
                    }               
                    for (int k = i / 3 * 3; k < i / 3 * 3 + 3; k++) {
                    for (int l = j / 3 * 3; l < j / 3 * 3 + 3; l++) {
                        if (i == k && j == l) {
                            continue;
                        } else if (current == board[k][l]) {
                            c = false;
                        }
                    }
                }
                }

            }
        }
        if(a==true && b==true && c==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}