class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        ArrayList<Integer> res=new ArrayList<>();
        if(n==1){
            res.add(0);
            return res;
        }
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] i: edges){
            int u=i[0];
            int v=i[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[]indegree=new int[n];
        for(int i=0;i<n;i++){
            indegree[i]=adj.get(i).size();
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==1){
                q.offer(i);
            }
        }
        while(n>2){
            int size=q.size();
            n-=size;
            while(size>0){
                size--;
                int u=q.peek();
                q.poll();
                for(int v: adj.get(u)){
                    indegree[v]--;
                    if(indegree[v]==1){
                        q.offer(v);
                    }
                }

            }
        }

        while(!q.isEmpty()){
            res.add(q.peek());
            q.poll();
        }
        return res;
        
    }
}