class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int p[] = new int [A.length];
        for(int i=0;i<A.length;i++){
            int c=0;
            for(int j=0 ;j<=i ; j++){
                for(int l=0;l<=i;l++){
                if(A[j]==B[l]){
                    c++;
                    break;
                }
            }
            }
            p[i]=c;
        }
        return p;
    }
}