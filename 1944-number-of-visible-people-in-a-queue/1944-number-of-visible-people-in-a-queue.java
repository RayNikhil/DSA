class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        Stack <Integer> st=new Stack<>();
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            int c=0;
        
            while (!st.isEmpty() && st.peek() < heights[i]) {
                st.pop();
                c++;
            }
            if (!st.isEmpty()) {
                c++;
            }
            ans[i] = c;
            st.push(heights[i]);

        }
        return ans;
    }
}