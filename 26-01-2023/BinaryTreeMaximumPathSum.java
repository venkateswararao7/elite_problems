class Solution {
    int max=Integer.MIN_VALUE;;
    int maxSum(TreeNode root){
        if(root==null)
            return 0 ;
        int left=Math.max(0,maxSum(root.left));
        int right=Math.max(0,maxSum(root.right));
        max=Math.max(left+right+root.val,max);
        return Math.max(left,right)+root.val;
        
    }
    public int maxPathSum(TreeNode root) {
        maxSum(root);
        return max;
    }
}
