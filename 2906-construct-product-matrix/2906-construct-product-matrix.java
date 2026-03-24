class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int p[]=new int[m*n];
        int s[]=new int[m*n];
        int arr[]=new int[m*n];
        int idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[idx++]=grid[i][j];
            }
        }
        p[0]=1;
        for(int i=1;i<arr.length;i++){
            p[i] = (int)((long)p[i-1] * arr[i-1] % 12345);
        }
        s[s.length-1]=1;
        for(int i=s.length-2;i>=0;i--){
            s[i] = (int)((long)s[i+1] * arr[i+1] % 12345);
        }
        for(int i=0;i<p.length;i++){
            p[i]=(p[i]*s[i])%12345;
        }
        int res[][]=new int[m][n];
        idx=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[i][j]=p[idx++];
            }
        }
        return res;
    }
}