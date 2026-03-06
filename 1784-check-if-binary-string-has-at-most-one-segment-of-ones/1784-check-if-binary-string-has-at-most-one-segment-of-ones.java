class Solution {
    public boolean checkOnesSegment(String s) {
        char arr[]=s.toCharArray();
        int n=arr.length;
       for(int i = 1; i < n; i++){
            if(arr[i] == '1' && arr[i-1] == '0'){
                return false;
            }
        }

        return true;
    }
}