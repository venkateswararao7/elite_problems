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
    void inOrder(TreeNode root,List<Integer>arr)
    {
        if(root==null)
            return ;
        inOrder(root.left,arr);
        arr.add(root.val);
        inOrder(root.right,arr);
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;
         List<Integer>arr=new LinkedList<>();
         inOrder(root,arr);
         for(int i=0;i<arr.size()-1;i++)
         {
             if(arr.get(i)>=arr.get(i+1))
                return false;
         }
         return true;
    }
}
