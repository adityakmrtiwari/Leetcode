// class Solution {
//     public boolean repeatedSubstringPattern(String s) {
//         int n = s.length();
//         for(int i=0;i<s.length();i++){
//             for(int j=i;j<s.length();j++){
//                 String st = s.substring(i,j+1);

//                 // only check patterns shorter than the full string
//                 if (st.length() < n && n % st.length() == 0) {
//                     StringBuilder sb = new StringBuilder();
//                     while (sb.length() < n) {
//                         sb.append(st);
//                     }
//                     if (sb.toString().equals(s)) {
//                         return true; // found a repeating substring
//                     }
//                 }
//             }
//         }
//         return false; // no repeating pattern found
//     }
// }



class Solution {
    public boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }
}
