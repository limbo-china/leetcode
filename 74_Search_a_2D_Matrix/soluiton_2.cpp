class Solution {
public:
bool searchMatrix(vector<vector<int> >& matrix, int target)
{
	int r = matrix.size();

	if (r == 0)
		return false;
	int c = matrix[0].size();
	int h = r * c - 1, l = 0, m;
	while (l <= h) {
		m = (h + l) / 2;
		if (matrix[m / c][m % c] == target)
			return true;
		else if (matrix[m / c][m % c] < target)
			l = m + 1;
		else
			h = m - 1;
	}
	return false;
}
};
