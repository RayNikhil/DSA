class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int s=0;
        int e=n-1;
        while(s<=e){
            if(nums[s]==target){
                return s;
            }
            s++;
        }
        return -1;
    }
}