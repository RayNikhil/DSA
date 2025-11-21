class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        int[] ans = new int[n];
        int k = 0;
        for (int i = 0; i < order.length; i++) {       
            for (int j = 0; j < friends.length; j++) { 
                if (order[i] == friends[j]) {
                    ans[k++] = friends[j];       
                }
            }
        }
        return ans;
    }
}