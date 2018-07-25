1. 爆破
2. 动规   
	dp[i][j]表示以(i,j)为右下角顶点的最大正方形边长

	转换方程：
	dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;