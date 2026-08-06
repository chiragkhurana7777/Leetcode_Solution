class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        } 
        else {
            int[][] ans = new int[r][c];
            int a = 0, b = 0;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    ans[i][j] = mat[a][b];
                    b++;
                    if (b == n) {
                        a++;
                        b = 0;
                    }
                }   
            }

            return ans;
        }
    }
}