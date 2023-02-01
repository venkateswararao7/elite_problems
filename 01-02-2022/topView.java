import java.util.* ;
import java.io.*; 
import javafx.util.Pair;
/************************************************************

    Following is the TreeNode class structure:

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

************************************************************/

public class Solution {
	public static ArrayList<Integer> getTopView(BinaryTreeNode root) {
		ArrayList<Integer>topview=new ArrayList<>();
		Queue<Pair>queu=new LinkedList<>();
		Map<Integer,Integer>map=new TreeMap<>();
		if(root==null)
			return topview;
		queu.add(new Pair(root,0));
		while(!queu.isEmpty())
		{
				Pair node=queu.remove();
				BinaryTreeNode curr=(BinaryTreeNode)node.getKey();
				int offset=(int )node.getValue();
				if(map.get(offset)==null)
				{
					map.put(offset,curr.val);
				}
				if(curr.left!=null){
					queu.add(new Pair(curr.left,offset-1));
				}
				if(curr.right!=null){
					queu.add(new Pair(curr.right,offset+1));
				}
		}
		for(Map.Entry<Integer,Integer>mp:map.entrySet())
			topview.add(mp.getValue());
		return topview;
	}
}
