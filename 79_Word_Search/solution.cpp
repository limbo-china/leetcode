class Solution {
public:
bool exist(vector<vector<char> >& board, string word)
{
	int r = board.size();

	if (!r)
		return false;
	int c = board[0].size();
	vector<vector<bool> > table(r, vector<bool>(c, false));
	if (!word.length())
		return false;
	for (int i = 0; i < r; i++)
		for (int j = 0; j < c; j++)
			if (board[i][j] == word[0])
				if (DFS(board, table, i, j, word, 0))
					return true;
	return false;
}
bool DFS(vector<vector<char> >&board, vector<vector<bool> >&table, int i, int j, string &word, int k)
{
	if (board[i][j] == word[k] && table[i][j] == false) {
		table[i][j] = true;
		if (k == word.size() - 1)
			return true;
		if (i != board.size() - 1)
			if (DFS(board, table, i + 1, j, word, k + 1))
				return true;
		if (i != 0)
			if (DFS(board, table, i - 1, j, word, k + 1))
				return true;
		if (j != board[0].size() - 1)
			if (DFS(board, table, i, j + 1, word, k + 1))
				return true;
		if (j != 0)
			if (DFS(board, table, i, j - 1, word, k + 1))
				return true;
		table[i][j] = false;
	}
	return false;
}
};
