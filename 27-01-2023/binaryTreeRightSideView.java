class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>list=new LinkedList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null)
            return list;
        queue.add(root);
        while(queue.size()!=0)
        {
            int length=queue.size();
            for(int i=0;i<length;i++)
            {   
                TreeNode curr=queue.poll();
                if(i==length-1)
                    list.add(curr.val);
                if(curr.left!=null)
                {
                    queue.add(curr.left);
                }
                if(curr.right!=null)
                {
                    queue.add(curr.right);
                }
            }
        }
        return list;
    }
}
