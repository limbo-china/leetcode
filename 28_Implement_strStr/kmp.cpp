
//kmp algorithm, more introduction in clrs.

class Solution {
public:
    int strStr(string haystack, string needle) {
        vector<int> PI;
        CalcPI(PI,needle);
        for(int temp:PI)
            cout<<temp;
        return 0;
    }

    void CalcPI(vector<int>& PI, string &needle){
        int m=needle.size();
        int i,j;
        PI[1]=0;
        i=0;
        for(j=2;j<m;j++){
            while(i>0 && needle[i+1]!=needle[j])
                i=PI[i];
            if(needle[i+1]==needle[j])
                i=i+1;
            needle[j]=i;
        }
    }
};
