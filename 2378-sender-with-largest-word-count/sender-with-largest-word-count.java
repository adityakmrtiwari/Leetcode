class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < senders.length; i++) {
            int x = wordsCountofMessages(messages[i]);
            map.put(senders[i], map.getOrDefault(senders[i], 0) + x);
        }
        int len = 0;
        String res = "";
        for (String st : map.keySet()) {
            if (map.get(st) > len) {
                len = map.get(st);
                res = st;
            }else if(len == map.get(st)){
                if(res.compareTo(st)<0) res = st;
            }
        }
        return res;
    }

    private int wordsCountofMessages(String msg) {
        int ct = 1;
        for (int i = 0; i < msg.length(); i++) {
            if (msg.charAt(i) == ' ')
                ct++;
        }
        return ct;
    }
}