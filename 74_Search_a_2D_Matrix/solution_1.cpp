class Solution {
public:
bool searchMatrix(vector<vector<int> >& matrix, int target)
{
	int r = matrix.size();

	if (r == 0)
		return false;
	int c = matrix[0].size();
	int rl, rh, rm, cl, ch, cm;
	rl = 0; rh = r - 1;
	while (rl <= rh) {
		rm = (rl + rh) / 2;
		if (matrix[rm][0] == target || matrix[rm][c - 1] == target)
			return true;
		else if (matrix[rm][0] > target)
			rh = rm - 1;
		else if (matrix[rm][c - 1] < target)
			rl = rm + 1;
		else{
			cl = 0; ch = c - 1;
			while (cl <= ch) {
				cm = (cl + ch) / 2;
				if (matrix[rm][cm] == target)
					return true;
				else if (matrix[rm][cm] > target)
					ch = cm - 1;
				else
					cl = cm + 1;
			}
			return false;
		}
	}
	return false;
}
};
