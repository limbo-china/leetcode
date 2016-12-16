class Solution {
	public:
		int numDecodings(string s) {

			int len = s.length();
			vector<int> num(len,0);
			
			if(len ==0 || s[0] == '0')
                return 0;
            num[0] = 1;
            if(len >= 2){
                int i = atoi(s.substr(0,2).c_str());
                if(i >= 1 && i <= 26 && s[1] != '0')
                    num[1] = 2;
                else if(!(i%10) && s[0]>'2')
                    return 0;
                else
                    num[1] = 1;
            }


			int i;
			for(i=2;i<len;i++){
				if(s[i-1]=='1'){
					if(s[i] != '0')
						num[i] =num[i-1]+num[i-2];
					else
						num[i] = num[i-2];
				}
				else if(s[i-1] =='2'){
					if(s[i] > '0' && s[i] < '7')
						num[i] =num[i-1]+num[i-2];
					else if(s[i] == '0')
						num[i] = num[i-2];
					else
					    num[i] = num[i-1];
				}
			    else if(s[i] == '0'){
			        return 0;
			    }
                    
                else
                    num[i]=num[i-1];

			}

			return num[len-1];	   
		}

};