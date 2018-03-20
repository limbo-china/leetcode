class Solution {
public:
    bool isIsomorphic(string s, string t) {
        map<char, char> m1;
        char m2[128] ={0};
        for(int i=0;i<s.length();i++){
            if(m1.find(s[i]) != m1.end() || m2[t[i]] == 1){
                if(m1[s[i]] != t[i] )
                    return false;
            }
            else
                m1[s[i]] = t[i], m2[t[i]]=1;
        }
        return true;
    }
};