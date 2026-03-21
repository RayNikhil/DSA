class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int row=grid.length;
        int col=grid[0].length;
        int sr=x;
        int sc=y;
        int er=x+k-1;
        int ec=y+k-1;
        while(sr<=er ){
            int i=sc;
            int j=ec;
            while(i<=j){
            int temp=grid[sr][i];
            grid[sr][i]=grid[er][i];
            grid[er][i]=temp;
            i++;
            }
            sr++;
            er--;
        }
        return grid;
    }
}