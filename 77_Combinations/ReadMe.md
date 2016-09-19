回溯backtracking题。
很多类似题,如46题等。

**solution 1**
递归法：即上述回溯写法.


**solution 2**
迭代法：减少了很多开销。
代码解释：（非常漂亮，比较难写出）
p contains the actual combinations in result. For n = 4, k = 2, p changes in this way:

0 0 #initialization
1 0
1 1
1 2 #push_back
1 3 #push_back
1 4 #push_back
1 5
2 5
2 2 #push_back
2 3 #push_back
2 4 #push_back
...
3 4 #push_back
3 5
4 5
4 4
4 5
5 5 #stop
As you can see, the code iterates through smallest combination to the largest combination, and returns all qualified combinations.
