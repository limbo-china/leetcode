主要是o(k)的空间复杂度。

我自己从前往后推，迭代，用2个变量做中间变量。

还有更好的方法，从后往前迭代，不用中间变量，更简洁。

参考：

class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> vi(rowIndex + 1);
       	vi[0] = 1;
        for (int i = 0; i <= rowIndex ; ++i)
        {
        	for (int j = i; j > 0; --j)
        	{
	        	vi[j] = vi[j] + vi[j-1];
        	}
        }
        return vi;
    }
};