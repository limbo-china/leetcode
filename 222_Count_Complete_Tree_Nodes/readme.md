算左右子树高度。

如果左高度=右高度，则说明左边满，再对右边递归算节点数
如果不相等，则说明右边是高度-1的满树，对左边递归算节点数

优化：
子树的高度可以用父树的高度-1得到，避免不必要的递归。

完全二叉树的高度必定等于左子树的高度+1