class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int nums1[]=new int[n];
        int nums2[]=new int[n];
        nums1[0]=nums[0];
        nums2[0]=nums[1];
        int i1 = 1;
        int i2 = 1;

        for (int i = 2; i < n; i++) {

            if (nums1[i1 - 1] > nums2[i2 - 1]) {
                nums1[i1] = nums[i];
                i1++;
            } else {
                nums2[i2] = nums[i];
                i2++;
            }
        }

        int[] result = new int[n];

        for (int i = 0; i < i1; i++) {
            result[i] = nums1[i];
        }

        for (int i = 0; i < i2; i++) {
            result[i1 + i] = nums2[i];
        }

        return result;
    }
}