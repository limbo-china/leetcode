1. 普通做法

	两个栈。一个正常栈，另一个的维护最小值，其栈顶元素是正常栈中的最小值
	
	当入栈的元素**小于等于**最小值栈顶元素时，同时入最小值栈。当出栈的元素**等于**最小值栈顶元素时，同时最小值出栈

2. 单栈方法

	只用一个栈。
	
	用一个数记录最当前最小值，当入栈元素小于等于当前最小值时，先把最小值入栈并更新最小值，再入正常元素（这就不会把之前的最小值给丢失，将它保存在下一个最小值之前的位置）；

	当出栈时，若出栈元素等于当前最小值（即把最小值给出栈了），此时栈顶的元素是之前第二小的元素，现在变成了第一小的元素，同时出栈这个元素并更新最小值。

3. 自创栈结构

	自创栈的数据结构，每个节点包含：自身值、当前栈的最小值和下一个节点