class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                Stack<Integer> st = new Stack<>();
                st.push(i);

                while (!st.isEmpty()) {
                    int city = st.pop();
                    if (!visited[city]) {
                        visited[city] = true;

                        for (int j = 0; j < n; j++) {
                            if (isConnected[city][j] == 1 && !visited[j])
                                st.push(j);
                        }
                    }
                }
                provinces++;
            }
        }
        return provinces;
    }
}