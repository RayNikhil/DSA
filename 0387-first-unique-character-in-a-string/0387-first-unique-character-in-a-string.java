class Solution {
    public int firstUniqChar(String s) {
           int[] charCount = new int[256];
        for (char c : s.toCharArray()) {
            charCount[c]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i)] == 1) {
                return i; 
            }
        }
        return -1;
    }
}