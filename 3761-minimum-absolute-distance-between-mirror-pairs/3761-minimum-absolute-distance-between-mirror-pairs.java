class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
         int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                res=Math.min(res,i-map.get(nums[i]));
            }

            int rev=reverse(nums[i]);
            map.put(rev,i);
        }

        return res==Integer.MAX_VALUE?-1:res;
    }

    public int reverse(int num){
        int n=num;
        int c=0;
        while(n>0&&c==0){
            c=n%10;
            n=n/10;
        }

        int res=c;
        while(n>0){
            int curr=n%10;
            res=res*10+curr;
            n=n/10;
        }

        return res;
    }
}