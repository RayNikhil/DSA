class Solution {
    public int minimumOperations(int[] nums){
        int c  =0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]%3!=0){
            if(nums[i] <3){
                nums[i]+=1;
                c++;
            }
            if(nums[i] >3){
                nums[i]-=1;
                c++;
            }
        }
        }
        return c;   
    }
}