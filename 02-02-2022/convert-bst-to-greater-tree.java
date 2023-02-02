/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum=0;
    void convertgt(TreeNode root){
        if(root==null)
            return ;
        convertgt(root.right);
        root.val=root.val+sum;
        sum=root.val;
        convertgt(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        convertgt(root);
        return root;
    }
}
