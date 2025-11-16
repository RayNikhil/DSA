class Solution {
    public int[][] generateMatrix(int n) {
        int a[][]=new int[n][n];
        int ru=0;
        int rd=n-1;
        int cl=0;
        int cr=n-1;
        int c=1;
        while(ru<=rd && cl<=cr){
            for(int i=cl;i<=cr;i++){
                    a[ru][i]=c++;
                }
                ru++;
                for(int i=ru;i<=rd;i++){
                    a[i][cr]=c++;
                }
                cr--;
                for(int i=cr;i>=cl;i--){
                    a[rd][i]=c++;
                }
                rd--;
                for(int i=rd;i>=ru;i--){
                    a[i][cl]=c++;
                }
                cl++;
         }
         return a;
     }
}