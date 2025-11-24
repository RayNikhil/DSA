class Solution {
    public int[] getNoZeroIntegers(int n) {
        int result[]=new int[2];
        for(int i=1;i<=n;i++){
            if(n-i>0&&donothave_Zero(n-i)&&donothave_Zero(i)){
            result[0]=i;
            result[1]=n-i;
            break;
        }
        }
        return result;
    }
    public boolean donothave_Zero(int n){
        int c=n;
        while(n!=0){
            int r=n%10;
            if(r==0)return false;
            n=n/10;
        }
        return true;
    }
}