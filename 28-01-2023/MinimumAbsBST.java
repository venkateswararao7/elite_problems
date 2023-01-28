class Solution {
     void inOrder(TreeNode root,List<Integer>arr)
    {
        if(root==null)
            return ;
        inOrder(root.left,arr);
        arr.add(root.val);
        inOrder(root.right,arr);
    }
    public int getMinimumDifference(TreeNode root) {
        List<Integer>arr=new LinkedList<>();
        int min=Integer.MAX_VALUE;
        if(root==null)
            return 0;
        inOrder(root,arr);
        for(int i=0;i<arr.size()-1;i++)
        {
            int m=arr.get(i+1)-arr.get(i);
            min=Math.min(m,min);
        }
        return min;
    }

}
