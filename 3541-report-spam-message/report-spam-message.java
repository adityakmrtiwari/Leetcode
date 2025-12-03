class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> set = new HashSet<>();
        for (String st : bannedWords) {
            set.add(st);
        }
        int ct = 0;
        for (String st : message) {
            if (set.contains(st)) ct++;
        }
        if (ct >= 2)
            return true;
        return false;
    }
}