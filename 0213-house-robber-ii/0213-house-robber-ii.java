class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        int ans1 = robLinear(nums, 0, n - 2);

        int ans2 = robLinear(nums, 1, n - 1);

        return Math.max(ans1, ans2);
    }

    private int robLinear(int[] nums, int start, int end) {
        int dp[] = new int[end - start + 1];

        dp[0] = nums[start];
        if (dp.length > 1)
            dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(nums[start + i] + dp[i - 2], dp[i - 1]);
        }

        return dp[dp.length - 1];
    }
}