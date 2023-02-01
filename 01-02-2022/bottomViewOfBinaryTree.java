import java.util.* ;
import java.io.*; 
import javafx.util.Pair;
/*********************************************

    class BinaryTreeNode {
        int val;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

*********************************************/


public class Solution {
    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
        Queue<Pair>queu=new LinkedList<>();
        Map<Integer,Integer>map=new TreeMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        if(root==null)
            return list;
        queu.offer(new Pair(root,0));
        while(!queu.isEmpty())
        {
            Pair pair=queu.remove();
            BinaryTreeNode curr=(BinaryTreeNode)pair.getKey();
            int offset=(int) pair.getValue();
            map.put(offset,curr.val);
				if(curr.left!=null){
					queu.add(new Pair(curr.left,offset-1));
				}
				if(curr.right!=null){
					queu.add(new Pair(curr.right,offset+1));
				}
		}
		for(Map.Entry<Integer,Integer>mp:map.entrySet())
			list.add(mp.getValue());
		return list;
    }
}
