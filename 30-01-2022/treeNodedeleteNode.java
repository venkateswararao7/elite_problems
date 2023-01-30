class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)
            return null;
        TreeNode curr=root;
        TreeNode gp=null;
        while(curr!=null && curr.val!=key)
        {
            gp=curr;
            if(curr.val<key)
                curr=curr.right;
            else
                curr=curr.left;
        }
        if(curr==null)
            return root;
        if(curr.left!=null && curr.right !=null) 
        {
            TreeNode rRight=curr.right;
            if(rRight.left==null)
            {
                int min=curr.val;
                curr.val=rRight.val;
                rRight.val=min;
                curr.right=rRight.right;
            }
            else
            {
                TreeNode temp=rRight.left;
                TreeNode parent=rRight;
                while(temp.left!=null)
                {
                    parent=temp;
                    temp=temp.left;
                }
                int min=curr.val;
                curr.val=temp.val;
                temp.val=min;
                parent.left=temp.right;
            }
            return root;
        }
        if(curr.val==root.val){
            if(root.left!=null)
                root=root.left;
            else
                root=root.right;
            return root;
        }
        if(curr.left==null && curr.right!=null)
        {
            if(key<gp.val)
            {
                gp.left=curr.right;
            }
            else
            {
                gp.right=curr.right;
            }
            return root;
        }
        if(curr.right==null && curr.left!=null)
        {
            System.out.println(gp.val);
            if(gp.val>curr.val)
                gp.left=curr.left;
            else
                gp.right=curr.left;
            return root;
        }

        if(curr.left==null && curr.right==null)
        {
            if(gp==null && curr.val==key)
                return null;

            else if(gp.val<key)
                gp.right=null;
            else
                gp.left=null;
            return root;
        }
       return root;
    }
}
