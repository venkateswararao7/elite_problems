class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode curr=root;
        TreeNode pare=null;
        TreeNode newNode=new TreeNode(val);
        if(root==null)
            return newNode;
        while(curr!=null)
        {
            pare=curr;
            if(curr.val>val)
                curr=curr.left;
            else
                curr=curr.right;
        }
        if(pare.val>val)
            pare.left=newNode;
        if(pare.val<val)
            pare.right=newNode;
        return root;
    }
}
