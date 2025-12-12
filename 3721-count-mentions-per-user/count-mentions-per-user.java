class Solution {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        int[] mentions = new int[numberOfUsers];

        // online[i] = whether user i is currently online
        boolean[] online = new boolean[numberOfUsers];
        Arrays.fill(online, true);

        // offlineEnd[i] = time when user i comes back online
        int[] offlineEnd = new int[numberOfUsers];
        Arrays.fill(offlineEnd, -1);

        // 1️⃣ Sort events by timestamp, OFFLINE before MESSAGE if same time
        events.sort((a, b) -> {
            int t1 = Integer.parseInt(a.get(1));
            int t2 = Integer.parseInt(b.get(1));
            if (t1 != t2) return t1 - t2;
            return a.get(0).equals("OFFLINE") ? -1 : 1;
        });

        // 2️⃣ Process events
        for (List<String> event : events) {
            int time = Integer.parseInt(event.get(1));

            // Bring users back online if their offline period ended
            for (int i = 0; i < numberOfUsers; i++) {
                if (!online[i] && offlineEnd[i] <= time) {
                    online[i] = true;
                }
            }

            if (event.get(0).equals("OFFLINE")) {
                int id = Integer.parseInt(event.get(2));
                online[id] = false;
                offlineEnd[id] = time + 60;
            } else { // MESSAGE
                String msg = event.get(2);

                if (msg.equals("ALL")) {
                    for (int i = 0; i < numberOfUsers; i++) {
                        mentions[i]++;
                    }
                } else if (msg.equals("HERE")) {
                    for (int i = 0; i < numberOfUsers; i++) {
                        if (online[i]) mentions[i]++;
                    }
                } else {
                    String[] parts = msg.split(" ");
                    for (String p : parts) {
                        int id = Integer.parseInt(p.substring(2));
                        mentions[id]++;
                    }
                }
            }
        }

        return mentions;

    }
}