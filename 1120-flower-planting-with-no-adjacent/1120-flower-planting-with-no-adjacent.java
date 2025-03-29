import java.util.*;

class Pair {
    int first;
    int second;
    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Solution {
    public void bfs(int src, int[] color, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(src);

        while (!q.isEmpty()) {
            int node = q.poll();
            boolean[] used = new boolean[5];

            for (int nbr : adj.get(node)) {
                if (color[nbr] != -1) {
                    used[color[nbr]] = true;
                }
            }

            for (int c = 1; c <= 4; c++) {
                if (!used[c]) {
                    color[node] = c;
                    break;
                }
            }

            for (int nbr : adj.get(node)) {
                if (color[nbr] == -1) {
                    q.offer(nbr);
                }
            }
        }
    }

    public int[] gardenNoAdj(int n, int[][] paths) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] path : paths) {
            int u = path[0];
            int v = path[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] color = new int[n + 1];
        Arrays.fill(color, -1);

        for (int i = 1; i <= n; i++) {
            if (color[i] == -1) {
                bfs(i, color, adj);
            }
        }

        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = color[i + 1];
        }
        return res;
    }
}
