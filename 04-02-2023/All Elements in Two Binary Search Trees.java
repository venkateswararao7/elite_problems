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
    void inOrder(TreeNode root,List<Integer>list)
    {
        if(root==null)
            return ;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer>list=new LinkedList<>();
        inOrder(root1,list);
        inOrder(root2,list);
        Collections.sort(list);
        return list;
    }
}
