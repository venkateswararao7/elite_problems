class Solution {
    int[] arr={0};
    TreeNode bst(int[] pre,int low,int hig)
    {
        if(arr[0]==pre.length || pre[arr[0]]>hig)
            return null;
        TreeNode root=new TreeNode(pre[arr[0]++]);
        root.left=bst(pre,low,root.val);
        root.right=bst(pre,pre[arr[0]-1],hig);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return bst(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
}
