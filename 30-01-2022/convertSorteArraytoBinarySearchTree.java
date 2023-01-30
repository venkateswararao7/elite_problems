class Solution {
    TreeNode bst(int[] nums,int low,int hig)
    {   if(low>hig)
            return null;
        int mid=(low+hig)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=bst(nums,low,mid-1);
        root.right=bst(nums,mid+1,hig);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)
            return null;
        return bst(nums,0,nums.length-1);
    }
}
