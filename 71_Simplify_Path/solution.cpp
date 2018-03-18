class Solution {
public:
    string simplifyPath(string path) {
        vector<string> s;
        string str;
        int flag=-1;
        for(int i=0 ;i<path.size();i++){
            if(path[i] == '/'){
                if(flag != -1){
                    if(str == ".." && s.size()>0)
                        s.pop_back();
                    else if(str !="." && str != "..")
                        s.push_back(str);
                    str.clear();
                    flag = -1;
                }
                continue;
            }
            str.push_back(path[i]);
            flag = 0;
        }
        if(flag != -1){
            if(str == ".." && s.size()>0)
                s.pop_back();
            else if(str !="." && str != "..")
                s.push_back(str);
        }
        string res;
        if(s.size() == 0)
            res.push_back('/');
        for(vector<string>::iterator it = s.begin(); it !=s.end(); it++ )
        {
            res.push_back('/');
            for(int i=0;i<(*it).length();i++)
                res.push_back((*it)[i]);     
        }
        return res;       
    }
};