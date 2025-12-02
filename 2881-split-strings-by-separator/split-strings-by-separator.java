class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            String[] wordsArr = word.split("[" + separator + "]");
            for (String part : wordsArr) {
                if (!part.isEmpty()) {
                    res.add(part);
                }
            }
        }
        return res;
    }
}