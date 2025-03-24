import java.util.*;

class Pair {
    int node;
    int weight;

    public Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer, List<Pair>> map = new HashMap<>();
        for (int[] vec : times) {
            int u = vec[0], v = vec[1], w = vec[2];
            map.putIfAbsent(u, new ArrayList<>());
            map.get(u).add(new Pair(v, w));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.weight));
        int[] result = new int[n + 1];
        Arrays.fill(result, Integer.MAX_VALUE);

        result[k] = 0;
        pq.offer(new Pair(k, 0));

        while (!pq.isEmpty()) {
            Pair top = pq.poll();
            int d = top.weight, node = top.node;

            if (!map.containsKey(node)) continue;

            for (Pair vec : map.get(node)) {
                int adjNode = vec.node, adjWeight = vec.weight;

                if (d + adjWeight < result[adjNode]) {
                    result[adjNode] = d + adjWeight;
                    pq.offer(new Pair(adjNode, result[adjNode]));
                }
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (result[i] == Integer.MAX_VALUE) return -1; 
            ans = Math.max(ans, result[i]);
        }
        return ans;
    }
}
