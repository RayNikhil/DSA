class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int n=accounts[0].length;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<m;i++){
             int total=0;
            for(int j=0;j<n;j++){
                total+=accounts[i][j];
            }
            max=Math.max(max,total);
        }
        return max;
    }
}