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
    class queueOb{
        TreeNode node;
        int lev;
        queueOb(TreeNode node,int val)
        {
            this.node=node;
            lev=val;
        }

    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<queueOb>queue=new  LinkedList<>();
        if(root==null)
            return 0;
        queue.offer(new queueOb(root,0));
        int maxWidth=0;
        
        while(!queue.isEmpty())
        {
            int length=queue.size();
            int i=0;
            int w=0;
            int la=0;
            List<Integer>list=new LinkedList<>();
            for(i=0;i<length;i++)
            {
                queueOb currLevel=queue.remove();
                TreeNode node=currLevel.node;
                int id=currLevel.lev;
                if(i==0)
                    w=id;
                if(i==length-1)
                    la=currLevel.lev;
                if(node.left!=null)
                { 
                    queue.add(new queueOb(node.left,2*id+1));
                }
                if(node.right!=null)
                {
                    queue.add(new queueOb(node.right,2*id+2));
                }
                 
            }
            maxWidth=Math.max(maxWidth,la-w+1);
        }
        return maxWidth;
    }
}
