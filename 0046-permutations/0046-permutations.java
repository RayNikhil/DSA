class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        recpermute(nums,ds,res,freq);
        return res;
    }
    private void recpermute(int[] nums,List<Integer> ds,List<List<Integer>> res,boolean[] freq){
        if(ds.size()==nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                recpermute(nums,ds,res,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
}