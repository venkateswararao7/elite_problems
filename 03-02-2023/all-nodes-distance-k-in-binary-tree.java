/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 class Pair{
    TreeNode node ;
    int lev ;
    
    public Pair(TreeNode node , int lev){
        this.node = node ; 
        this.lev = lev ;
    }
}
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
         HashMap<TreeNode ,TreeNode> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    DFS(root,map);  /// Will fill the hashmap with child parent relationship
    HashSet<TreeNode> set = new HashSet<>();  // To avoid duplicacy in answer
    
    Queue<Pair> q = new ArrayDeque<>();
    q.add(new Pair(target,0));
    set.add(target);
    while(!q.isEmpty()){  // BFS Traversal
        Pair pair = q.remove();
        TreeNode node = pair.node ;
        int lev = pair.lev;
        
        if(lev == k){
            list.add(node.val);
        }
        if(lev>k){
            return list ;
        }
        if(node.left!=null && !set.contains(node.left)){
            q.add(new Pair(node.left,lev+1));
            set.add(node.left);
        }
        if(node.right!=null && !set.contains(node.right)){
            q.add(new Pair(node.right,lev+1));
            set.add(node.right);
        }
        if(map.containsKey(node) && !set.contains(map.get(node))){
            q.add(new Pair(map.get(node),lev+1));
            set.add(map.get(node));
        }
    }
    
    return list ;
}
// DFS Traversal to establish a child parent relationship

public void DFS(TreeNode root , HashMap<TreeNode ,TreeNode> map){
    if(root == null){
        return ;
    }
    if(root.left!=null){
        map.put(root.left,root);
        DFS(root.left,map);
    }
    if(root.right!=null){
        map.put(root.right,root);
        DFS(root.right,map);
    }
}
}
