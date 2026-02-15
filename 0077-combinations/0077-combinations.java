class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        solve( n, k,new ArrayList<>(),  result);
        return result;
    }
    private void solve(int n,int k,List<Integer> curr, List<List<Integer>> result){
        if(k==0){
            result.add(new ArrayList(curr));
            return ;
        }
        if(n==0){
            return;
        }
        curr.add(n);
        solve(n-1,k-1,curr,result);
        curr.remove(curr.size()-1);
        solve(n-1,k,curr,result);
        
    }
}