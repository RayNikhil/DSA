class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lp=0;
        int rp=numbers.length-1;
        int sum=0;
        while(lp<rp){
            sum = numbers[lp] + numbers[rp];
            if(sum==target){
                return new int[]{lp + 1, rp + 1};
            }
            else if(sum>target){
                rp--;
            }
            else{
                lp++;
            }
        }
       return new int[]{-1, -1};
    }
}