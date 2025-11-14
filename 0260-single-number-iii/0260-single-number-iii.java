class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] res = new int[2];
        int idx = 0;
        for (int i = 0; i < n; ) {
            if (i == n - 1 || nums[i] != nums[i + 1]) {
                res[idx++] = nums[i];
                i++; 
            } else {
                i += 2; 
            }
        }
        return res;
    }
}
