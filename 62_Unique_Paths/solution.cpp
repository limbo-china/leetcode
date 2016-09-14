#include <iostream>
using namespace std;
class Solution {
public:
int uniquePaths(int N, int M)
{
	int n, m;
	if (N == 0 && M == 0)
		return 0;
	for (n = 0; n <= N; n++) {
		for (m = 0; m <= M; m++)
			if (n == 0 && m == 0)
				dp[n][m] = 0;
			else if (n == 0)
				dp[n][m] = 1;
			else if (n == 1)
				dp[n][m] = m + 1;
			else
				dp[n][m] = dp[n-1][m]+dp[n][m-1];
	}
	for (n = 0; n <= N; n++) {
		for (m = 0; m <= M; m++)
			cout << dp[n][m] << " ";
		cout << "\n";
	}
	return dp[N][M];
}
private:
int dp[101][101];
};

int main()
{
	Solution solu;
	int n, m;

	while (cin >> n >> m)
		cout << solu.uniquePaths(n, m) << endl;
}
