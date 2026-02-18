class Solution {
    int m,n;
    int result=0;
    int nonobs=0;
    int directions[][]={{1,0},{-1,0},{0,-1},{0,1}};

    public void backtrack(int grid[][],int count,int i,int j){
        if(i<0 || j<0||i>=m ||j>=n || grid[i][j]==-1) return;

        if(grid[i][j]==2){
            if(count==nonobs){
                result++;
            }
            return;
        }

        grid[i][j]=-1;

        for(int dir[] : directions){
            backtrack(grid,count+1,i+dir[0],j+dir[1]);
        }

        grid[i][j]=0;
    }

    public int uniquePathsIII(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        result=0;
        nonobs=0;

        int x=0,y=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0) nonobs++;

                if(grid[i][j]==1){
                    x=i;
                    y=j;
                }
            }
        }

        nonobs+=1;
        backtrack(grid,0,x,y);
        return result;
    }
}