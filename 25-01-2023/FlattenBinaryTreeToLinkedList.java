class Solution {
    public void preOrder(TreeNode node,List<Integer> result){
        if(node==null)
            return ;
        result.add(node.val);
        preOrder(node.left,result);
        preOrder(node.right,result);
    }
    public void flatten(TreeNode root) {
        List<Integer>result=new LinkedList<>();
        preOrder(root,result);
        TreeNode node=root;
        for(int i=1;i<result.size();i++){
            TreeNode temp=new TreeNode(result.get(i),null,null);
            node.right=temp;
            node.left=null;
            node=temp;
        }
    }
}
