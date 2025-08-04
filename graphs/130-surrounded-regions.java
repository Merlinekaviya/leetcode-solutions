class Solution {
    public void dfs(int i,int j,char[][] board,int row,int col){
        int[][] diff=new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        board[i][j]='.';
        for(int a=0;a<4;a++){
            int adjrow=i+diff[a][0];
            int adjcol=j+diff[a][1];
            if(adjrow<row && adjcol<col && adjrow>=0 && adjcol>=0){
                if(board[adjrow][adjcol]=='O'){
                    dfs(adjrow,adjcol,board,row,col);
                }
            }
        }
    }
    public void solve(char[][] board) {
        int row=board.length;
        int  col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||j==0||i==row-1||j==col-1){
                    if(board[i][j]=='O'){
                        dfs(i,j,board,row,col);
                    }
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
                if(board[i][j]=='.'){
                    board[i][j]='O';
                }
            }
        }
      
    }
}
