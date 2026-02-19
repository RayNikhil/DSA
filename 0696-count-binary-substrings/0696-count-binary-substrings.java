class Solution {
    public int countBinarySubstrings(String s) {
        int prevCount=0;
        int currCount=1;
        int result=0;
        int i=1;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(i-1)){
                currCount++;
            }else{
                result+=Math.min(currCount,prevCount);
                prevCount=currCount;
                currCount=1;
            }
            i++;
        }
        return result + Math.min(currCount,prevCount);
    }
}