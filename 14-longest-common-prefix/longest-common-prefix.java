class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Take the first string as the initial prefix.
        // Compare it with each of the other strings.  
        // While comparing, shorten the prefix until it matches the start of the current string.


        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            
            while (strs[i].indexOf(prefix) != 0) {

                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";

            }
        }
        return prefix;
    }
}

// Sorting + Compare First and Last

// class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         Arrays.sort(strs);
//         String first = strs[0];
//         String last = strs[strs.length - 1];

//         StringBuilder ans = new StringBuilder();

//         for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
//             if (first.charAt(i) != last.charAt(i))
//                 return ans.toString();
//             ans.append(last.charAt(i));
//         }
//         return ans.toString();
//     }
// }