class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        dictionary.sort((a, b) -> a.length() - b.length());
        // Sorts strings by length in ascending order
        StringBuilder res = new StringBuilder();
        for (String str : sentence.split(" ")) {
            for (int i = 0; i < dictionary.size(); i++) {
                if (str.startsWith(dictionary.get(i))) {
                    str = dictionary.get(i);
                    break;
                }
            }
            res.append(str + " ");
        }
        return res.toString().trim();
    }
}