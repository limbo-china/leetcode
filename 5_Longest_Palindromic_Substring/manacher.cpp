////manacher algorithm

class Solution {
public:
    string longestPalindrome(string s) {
        int n=s.size();
        int i,j,k,id=1,maxid=1,longestlen=1,longestid=1;
        if(n==1)
            return s;
        string t(s);
        for(i=0,k=0;i<n+1;i++){   //need to change to @#1#2#3#4#
            t.insert(k,"#");  //s.insert(k,'#')  compile err?
            k=k+2;
        }
        t.insert(0,"@");
        cout<<t<<endl;
        for(i=1;i<t.size();i++){
            if(maxid>i)
                p[i]=min(p[2*id-i],maxid-i);
            else 
                p[i]=1;
            while(t[i+p[i]]==t[i-p[i]])
                p[i]++;
            if(i+p[i]>maxid){
                maxid=i+p[i];
                id=i;
            }
            if(p[i]>longestlen){
                longestlen=p[i];
                longestid=i;
            }
        }
        for(i=longestid-longestlen+1,j=0;i<longestid+longestlen;i++){
            if(t[i]!='#'){
                s[j]=t[i];
                j++;
            }
        }
        s[j]='\0';
        return s.data();
    }
private: int p[2000]; 
};