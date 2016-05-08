class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        sort(strs.begin(),strs.end());
        for(int i=0;i<strs.size();i++){
            temp=strs[i];
            sort(temp.begin(),temp.end());
            group[temp].push_back(strs[i]);
        }
        for(map<string,vector<string>>::iterator it=group.begin();it!=group.end();it++){
            res.push_back(it->second);
        }
        return res;
    }
private:
    vector<vector<string>> res;
    map<string,vector<string>> group;
    string temp;
};
