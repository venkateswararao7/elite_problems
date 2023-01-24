 class Solution {
             List<Integer> ls = new ArrayList<>();
            public void preorder(TreeNode root,List<Integer> ls){
                if(root==null){
                    return;
                }
                ls.add(root.val);
                preorder(root.left,ls);
                preorder(root.right,ls);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root==null)
            return true;
        preorder(root,ls);
        for(int i=0;i<ls.size()-1;i++){
            if(ls.get(i)==ls.get(i+1));
            else
                return false;
        }
        return true;
        
    }
}
