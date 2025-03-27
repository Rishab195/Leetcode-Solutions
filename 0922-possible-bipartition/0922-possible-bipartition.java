import java.util.*;

class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] a : dislikes) {
            int u = a[0];
            int v = a[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] color = new int[n + 1];
        Arrays.fill(color, -1);

        for (int i = 1; i <= n; i++) {
            if (color[i] == -1) {
                if (!fillColor(i, adj, color, 0)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean fillColor(int src, ArrayList<ArrayList<Integer>> graph, int[] color, int rang) {
        color[src] = rang;
        for (int nbr : graph.get(src)) {
            if (color[nbr] != -1) {
                if (color[nbr] == color[src]) {
                    return false;
                }
            } else {
                if (!fillColor(nbr, graph, color, 1 - rang)) {
                    return false;
                }
            }
        }
        return true;
    }
}
