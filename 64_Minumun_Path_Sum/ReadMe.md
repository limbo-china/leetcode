DP.

if(i==0&&j==0)
    min[i][j]=grid[i][j];
if(i==0)
    min[i][j]=min[i][j-1]+grid[i][j];
else if(j==0)
    min[i][j]=min[i-1][j]+grid[i][j];
else
    min[i][j]=(min[i-1][j]>min[i][j-1])?(min[i][j-1]+grid[i][j]):(min[i-1][j]+grid[i][j]);
