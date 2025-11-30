class Solution {
    public int minOperations(int[] nums, int k) {
        long sum=0;
        for(int n : nums){
            sum+=n;
        }
        int rem=(int)(sum%k);
        return rem==0?0:rem;
    }
}