class Solution {
    public int totalNQueens(int n) {
        char board[][]=new char[n][n];
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nqueen(board,0,ans);
        return ans.size();
    }
    private static void nqueen(char board[][],int row,List<List<String>>ans){
        int n=board.length;
        List<String> l=new ArrayList<>();
        if(row==n){
            for(int i=0;i<n;i++){
                String str="";
            for(int j=0;j<n;j++){
                str+=board[i][j];
            }
            l.add(str);
        }
        ans.add(l);
        return ;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j,ans)){
                board[row][j]='Q';
                nqueen(board,row+1,ans);
                board[row][j]='.';
            }
        }
    }
    private static boolean isSafe(char board[][],int row, int col,List<List<String>>ans){
        int n=board.length;
        for(int j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }
        int i=row;
        int j=col;
        while(i>=0&&j<n){
            if(board[i][j]=='Q')return false;
            i--;
            j++;
        }
         i=row;
         j=col;
        while(i<n&&j<n){
            if(board[i][j]=='Q')return false;
            i++;
            j++;
        }
         i=row;
         j=col;
        while(i>=0&&j>=0){
            if(board[i][j]=='Q')return false;
            i--;
            j--;
        }
         i=row;
         j=col;
        while(i<n&&j>=0){
            if(board[i][j]=='Q')return false;
            i++;
            j--;
        }
        return true;
    }
}