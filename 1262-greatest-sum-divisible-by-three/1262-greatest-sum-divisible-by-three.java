class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = new int[] {0, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int x : nums) {
            int[] newdp = dp.clone();
            for (int r = 0; r < 3; r++) {
                int newR = (r + x) % 3;
                newdp[newR] = Math.max(newdp[newR], dp[r] + x);
            }
            dp = newdp;
        }
        return dp[0];
    }
}