class Solution {
public:
    int minPathSum(vector<vector<int>>& grid) {
        vector<vector<int>> min;
        vector<int> temp;
        int r,c;
        r=grid.size();
        if(r)
            c=grid[0].size();
        for(int j=0;j<c;j++)
            temp.push_back(0);
        for(int i=0;i<r;i++)
            min.push_back(temp);

        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++){
                if(i==0&&j==0)
                    min[i][j]=grid[i][j];
                if(i==0)
                    min[i][j]=min[i][j-1]+grid[i][j];
                else if(j==0)
                    min[i][j]=min[i-1][j]+grid[i][j];
                else
                    min[i][j]=(min[i-1][j]>min[i][j-1])?(min[i][j-1]+grid[i][j]):(min[i-1][j]+grid[i][j]);
            }
        return min[r-1][c-1];
    }
};
