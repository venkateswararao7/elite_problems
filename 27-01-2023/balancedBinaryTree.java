class Solution {
    int height(TreeNode root){
        if(root==null)
            return 0;
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        int left=height(root.left);
        int right=height(root.right);
        boolean l=isBalanced(root.left);
        boolean r=isBalanced(root.right);
        int b=left-right;
        if((b==0  || b==-1 || b==1) && l && r)
            return true;
        return false;
        
    }
}
