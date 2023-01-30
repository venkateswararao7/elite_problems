class Solution {
    TreeNode bst(List<Integer>list,int low,int hig)
    {   if(low>hig)
            return null;
        int mid=(low+hig)/2;
        TreeNode root=new TreeNode(list.get(mid));
        root.left=bst(list,low,mid-1);
        root.right=bst(list,mid+1,hig);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)
            return null;
        List<Integer>list=new ArrayList<>();
        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        return bst(list,0,list.size()-1);
    }
}
