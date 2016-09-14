class Solution {
public:
int uniquePathsWithObstacles(vector<vector<int> >& obstacleGrid)
{
	int r = obstacleGrid.size();

	if (r == 0)
		return 0;
	int c = obstacleGrid[0].size();
	for (int n = 0; n < r; n++)
		for (int m = 0; m < c; m++) {
			if (n == 0 && m == 0)
				obstacleGrid[n][m] = obstacleGrid[n][m] ? 1 : 2;
			else if (n == 0)
				obstacleGrid[n][m] = obstacleGrid[n][m] ? 1 : ((obstacleGrid[n][m - 1] == 1) ? 1 : obstacleGrid[n][m - 1]);
			else if (m == 0)
				obstacleGrid[n][m] = obstacleGrid[n][m] ? 1 : ((obstacleGrid[n - 1][m] == 1) ? 1 : obstacleGrid[n - 1][m]);
			else{
				if (obstacleGrid[n][m] != 1) {
					if (obstacleGrid[n - 1][m] == 1 && obstacleGrid[n][m - 1] == 1)
						obstacleGrid[n][m] = 1;
					else if (obstacleGrid[n - 1][m] == 1)
						obstacleGrid[n][m] = obstacleGrid[n][m - 1];
					else if (obstacleGrid[n][m - 1] == 1)
						obstacleGrid[n][m] = obstacleGrid[n - 1][m];
					else
						obstacleGrid[n][m] = obstacleGrid[n - 1][m] + obstacleGrid[n][m - 1] - 1;
				}
			}
		}
	return (obstacleGrid[r - 1][c - 1] == 1) ? 0 : (obstacleGrid[r - 1][c - 1] - 1);
}
};
//直接在原数组中修改值，为区分是否有障碍物和路径数目，将路径数目在原基础上加1
//最后输出时，若为1,则说明无法到达，路径数为0；若不为1，则输出减1
