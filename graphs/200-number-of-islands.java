class Solution {
    public  void dfs(int i, int j, char[][] grid, int row, int col) {
        
             int[][] diff =new int[][] {{0,1},{1,0},{-1,0},{0,-1}};
            grid[i][j]='0';
            for(int a=0;a<4;a++){
               int adjrow=i+diff[a][0];
                int adjcol=j+diff[a][1];
                 if(adjrow<row && adjcol<col && adjrow>=0 && adjcol>=0){
                    if(grid[adjrow][adjcol]=='1'){
                        dfs(adjrow,adjcol,grid,row,col);

                    }
                }
            }
  }
   
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1'){
                      count++;
                    dfs(i,j,grid,grid.length,grid[i].length);
                  
                  
                }
            }
           
        }
         return count;
        }
    
}
