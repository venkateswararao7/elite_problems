class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>list=new LinkedList<>();
        Queue<TreeNode>queue=new LinkedList<>();
        if(root==null)
            return list;
        List<Integer>li=new LinkedList<>();
        li.add(root.val);
        list.add(li);
        queue.add(root);
        boolean path=true;
         while(queue.size()>0){
            List<Integer>il=new LinkedList<>();
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
            // list.add(il);
            if(path)
            {
                Collections.reverse(il);
                list.add(il);
                path=false;
            }
            else
            {
                list.add(il);
                path=true;
            }
        }
        list.remove(list.size()-1);
        return list;
    }
}
