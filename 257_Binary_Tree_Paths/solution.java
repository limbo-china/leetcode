class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<List<Integer>> intList = new ArrayList<List<Integer>>();
        List<Integer> solu = new ArrayList<Integer>();
        binaryTreePaths(root, intList, solu);
        
        List<String> res= new ArrayList<String>();
        for(List<Integer> l : intList)
            res.add(listToString(l));
        
        return res;
        
    }
    private void binaryTreePaths(TreeNode root, List<List<Integer>> list, List<Integer> solu){
        if(root == null) return ;
        solu.add(root.val);
        if(root.left == null && root.right == null) list.add(new ArrayList<Integer>(solu));
        binaryTreePaths(root.left, list, solu);
        binaryTreePaths(root.right, list, solu);
        solu.remove(solu.size()-1);
    }
    private String listToString(List<Integer> list){
            
        StringBuilder builder = new StringBuilder();
        for(int i : list){
            builder.append(i);
            builder.append("->");
        }
        String res =  builder.toString();
        return res.substring(0, res.length()-2);
    }
}