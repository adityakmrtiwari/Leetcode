class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < tickets.length; i++) {
            q.offer(tickets[i]);
        }
        int time = 0;
        while (true) {
            int front = q.poll();

            time++;
            front--;
            if (front == 0 && k == 0) {
                break;
            }
            if (front > 0) {
                q.offer(front);
            }

            if (k == 0)
                k = q.size()-1;
            else
                k--;
        }
        return time;
    }
}