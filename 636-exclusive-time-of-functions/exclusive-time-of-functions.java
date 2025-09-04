class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];
        int prev_time = 0;

        for (String log : logs) {
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            String type = parts[1];
            int time = Integer.parseInt(parts[2]);

            if (type.equals("start")) {
                if (!st.isEmpty()) {
                    res[st.peek()] += time - prev_time;
                }
                st.push(id);
                prev_time = time;
            } else {
                res[st.pop()] += time - prev_time + 1;
                prev_time = time + 1;
            }
        }
        return res;
    }
}