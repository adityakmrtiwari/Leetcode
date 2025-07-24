class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>()); // initialize list for each node
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v); // u connects to v
            graph.get(v).add(u); // v connects to u (since it's undirected)
        }

        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];

        q.offer(source);
        visited[source] = true;

        while (!q.isEmpty()) {
            int a = q.poll();

            if (a == destination)
                return true;

            for (int i = 0; i < graph.get(a).size(); i++) {
                int nei = graph.get(a).get(i);
                if (!visited[nei]) {
                    q.offer(nei);
                    visited[nei] = true;
                }
            }
        }
        return false;
    }
}