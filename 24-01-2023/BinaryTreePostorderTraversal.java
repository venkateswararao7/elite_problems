class Solution {
    List<Integer>ls=new ArrayList<>();
    void postorder(TreeNode root,List<Integer> ls){
        if(root==null)
            return;
        postorder(root.left,ls);
        postorder(root.right,ls);
        ls.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
            return ls;
        postorder(root,ls);
        return ls;
        
    }
}
