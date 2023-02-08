class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean [] visited=new boolean[rooms.size()];
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty())
        {
            int curr=q.poll();
            for(int x:rooms.get(curr))
            {
                if(!visited[x])
                {
                    q.add(x);
                    visited[x]=true;
                }
            }
        }
        for(int i=0;i<visited.length;i++)
        {
            if(visited[i]==false)
                return false;
        }
        return true;
    }
}
