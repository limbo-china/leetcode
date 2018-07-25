class Solution {
    public int maximalSquare(char[][] matrix) {
        int n = matrix.length,m = n>0?matrix[0].length:0;
        int[][] dp = new int[n + 1][m + 1];
        int maxsqlen = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (matrix[i-1][j-1] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[i][j]);
                }
            }
        }
        return maxsqlen * maxsqlen;       
    }
       
}