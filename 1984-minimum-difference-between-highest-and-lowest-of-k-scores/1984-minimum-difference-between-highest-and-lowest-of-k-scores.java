class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        if(k==1)
        return 0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i+k-1<n;i++){
            min=Math.min(min,nums[i+k-1]-nums[i]);
        }
        return min;
    }
}