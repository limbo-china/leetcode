主要为一个特点:
	若ai<aj,且i<j , 则对所有的i<k<j, 都有(k-i)*min(ai,ak) < (j-i)*min(ai,aj) 
	所以从两端开始向中间找，每一次都可以去掉一边不考虑，复杂度为O(n).
	当i>j时，结束。