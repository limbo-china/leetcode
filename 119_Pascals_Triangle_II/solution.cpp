class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> row(rowIndex+1,1); 
        int t,m;
        for(int i=0;i<=rowIndex;i++){
            t = 1;
            for(int j=1;j<i;j++){
                m = row[j];
                row[j]=t+row[j];
                t = m;
            }
        }
        return row;
    }
};