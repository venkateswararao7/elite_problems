class Solution {
    void inOrder(TreeNode root,LinkedList<Integer>list)
    {
        if(root==null)
            return ;
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
   
    public int[] findMode(TreeNode root) {
        TreeMap<Integer,Integer>map=new TreeMap<>();
        LinkedList<Integer>list=new LinkedList<>();
        if(root==null)
            return new int [1];
        inOrder(root,list);
        for(int i=0;i<list.size();i++)
        {
            if(map.containsKey(list.get(i)))
            {
                map.replace(list.get(i),map.get(list.get(i))+1);
            }
            else
            {
                map.put(list.get(i),1);
            }
        }
        int max=maximum(map);
        List<Integer>li=new ArrayList<>();
        System.out.println(max);
        for(int x:map.keySet()){
            if(max==map.get(x))
                li.add(x);
        }
        int[] n=new int[li.size()];
        int i=0;
        for(int x:li)
            n[i++]=x;
        return n;
    }
    public int maximum(TreeMap<Integer,Integer>map)
    {
        int maxFrequency=0;
         for(int x:map.keySet())
            maxFrequency=Math.max(maxFrequency,map.get(x));
         return maxFrequency;       
    }
}
