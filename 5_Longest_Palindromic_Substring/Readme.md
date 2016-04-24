1.暴力
遍历 判断所有子串是否回文。O(n^3).

2.动规
p[i][j]=1,表示从i到j的子串是回文。O(n^2).
则 
p[i][j]=
{
	p[i+1][j-1],     if(s[i]==s[j])
	0,               if(s[i]!=s[j])
}

3.中心扩展
遍历，以某一点为中心，向外拓展判断。需注意奇数和偶数。O(n^2).

4.manacher
O(n).
manacher 需要注意，把字符串先转换成 @#a#b#c#d#e# 的样式， 不可以转成 @a#b#c#d#e ,两端一定要为#号。

 
reference:
	http://blog.csdn.net/kangroger/article/details/37742639
	
	http://blog.csdn.net/yzl_rex/article/details/7908259