class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)
            return list;
        queue.add(root);
        List<Integer>li=new ArrayList<>();
        li.add(root.val);
        list.add(li);
        while(queue.size()!=0){
            List<Integer>il=new ArrayList<>();
            int length=queue.size();
            for(int i=0;i<length;i++){
                TreeNode curr=queue.poll();
                if(curr.left!=null)
                {
                   il.add(curr.left.val);
                  
                   queue.add(curr.left);

                 }
                if(curr.right!=null){
                    il.add(curr.right.val);
                    
                    queue.add(curr.right);
                }
            }
            System.out.println(il);
            list.add(il);
            
        }
        System.out.println(list);
        list.remove(list.size()-1);
        return list;
    }
}
