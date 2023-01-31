class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        else if((p==null && q!=null)||(q==null && p!=null)||p.val!=q.val)
            return false;
        boolean left=isSameTree(p.left,q.left);
        boolean right=isSameTree(p.right,q.right);
        if(left && right)
            return true;
        return false;
    }
}
