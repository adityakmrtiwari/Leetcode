class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary);
        StringBuilder res = new StringBuilder();
        for (String str : sentence.split(" ")) {
            String p = str;
            for (int i = 0; i < dictionary.size(); i++) {
                if (str.startsWith(dictionary.get(i))) {
                    p = dictionary.get(i);
                    break;
                }
            }
            res.append(p+" ");
        }
        return res.toString().trim();
    }
}