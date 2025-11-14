class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
       int i = 0;
       for(int x : nums) ans[i++] = x;
       for(int x : nums) ans[i++] = x;
       return ans;
    }
}