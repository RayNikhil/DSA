class Solution {
    public int smallestNumber(int n, int t) {
        for (int i = n; ; i++) {
            int m = i;
            int p = 1;
            while (m > 0) {
                int d = m % 10;
                p *= d;
                m /= 10;
            }

            if (p % t == 0) {
                return i;
            }
        }
    }
}