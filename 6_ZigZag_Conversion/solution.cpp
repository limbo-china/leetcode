class Solution {
public:
    string convert(string s, int numRows) {
        if(numRows==1)
            return s;
        int i,j,ti=0;
        int n=s.size();
        string t;
        for(j=0;j<n;j=j+2*(numRows-1))
            t[ti++]=s[j];
        for(i=1;i<numRows-1;i++){
            for(j=i;j<n;j=j+2*(numRows-1)){
                t[ti++]=s[j];
                if(j+2*(numRows-i-1)<n)
                    t[ti++]=s[j+2*(numRows-i-1)];
            }
        }
        for(j=numRows-1;j<n;j=j+2*(numRows-1))
            t[ti++]=s[j];
        t[ti]='\0';
        return t.data();
    }
};
