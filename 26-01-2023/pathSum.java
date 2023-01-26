class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null )
            return false;
        if(root.val==targetSum && (root.left==null && root.right==null))
        {
            System.out.println(root.val);
            return true;

        }  
        System.out.println(targetSum);
        boolean left=hasPathSum(root.left,targetSum-root.val);
        boolean right=hasPathSum(root.right,targetSum-root.val);
        return left||right;
    }
}
