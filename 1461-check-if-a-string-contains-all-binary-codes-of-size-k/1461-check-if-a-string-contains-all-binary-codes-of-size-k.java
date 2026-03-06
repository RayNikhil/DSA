class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n=s.length();
        int codes=1<<k;
        Set<String> set=new HashSet<>();
        for(int i=k;i<=n;i++){
            String sub=s.substring(i-k,i);
            if(!set.contains(sub)){
                set.add(sub);
                codes--;
            }
            if(codes==0)return true;
        }
        return false;
    }
}