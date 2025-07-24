class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[rooms.size()];
        q.offer(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int r = q.poll();

            List<Integer> keys = rooms.get(r);
            for (int i = 0; i < keys.size(); i++) {
                int key = keys.get(i);
                if (!visited[key]) {
                    visited[key] = true;
                    q.offer(key);
                }
            }
        }
        for (int i = 0; i < visited.length; i++) {
            if (visited[i] == false)
                return false;
        }
        return true;
    }
}