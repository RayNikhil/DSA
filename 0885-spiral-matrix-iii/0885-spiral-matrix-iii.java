class Solution {
public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] result = new int[rows * cols][2];
        int[][] dir = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int index = 0;
        int step = 1;           
        int d = 0;              
        int r = rStart, c = cStart;
        result[index++] = new int[]{r, c};
        while (index < rows * cols) {
            for (int repeat = 0; repeat < 2; repeat++) {
                for (int i = 0; i < step; i++) {
                    r += dir[d][0];
                    c += dir[d][1];
                    if (r >= 0 && r < rows && c >= 0 && c < cols) {
                        result[index++] = new int[]{r, c};
                    }
                }
                d = (d + 1) % 4; 
            }
            step++;
        }
        return result;
    }
}
