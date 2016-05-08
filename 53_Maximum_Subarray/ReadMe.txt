1.暴力

2.分治
clrs 中有详细说明。O(nlogn).注意left>right 时产生的错误，需要特殊处理。

3.动规(Kadane's algorithm)
O(n).
max_sum 必然是以A[i](取值范围为A[0] ~ A[n-1])结尾的某段构成的，也就是说max_sum的candidate必然是以A[i]结果的。如果遍历每个candidate，然后进行比较，那么就能找到最大的max_sum了。

假设把A[i]之前的连续段叫做sum。可以很容易想到:

1. 如果sum>=0，就可以和A[i]拼接在一起构成新的sum'。因为不管A[i]多大，加上一个正数总会更大，这样形成一个新的candidate。

2. 反之，如果sum<0，就没必要和A[I]拼接在一起了。因为不管A[i]多小，加上一个负数总会更小。此时由于题目要求数组连续，所以没法保留原sum，所以只能让sum等于从A[i]开始的新的一段数了，这一段数字形成新的candidate。

3. 如果每次得到新的candidate都和全局的max_sum进行比较，那么必然能找到最大的max sum subarray.

在循环过程中，用max_sum记录历史最大的值。从A[0]到A[n-1]一步一步地进行。

reference:
    http://www.cnblogs.com/xkfz007/archive/2012/05/17/2506299.html
    http://blog.csdn.net/feliciafay/article/details/18860997
