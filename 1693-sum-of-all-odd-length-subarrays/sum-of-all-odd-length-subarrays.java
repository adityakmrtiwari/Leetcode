class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = i; j < n; j++) {
                s += arr[j];
                if ((j - i + 1) % 2 == 1) {
                    sum += s;
                }
            }
        }
        return sum;
    }
}

// BRUTE FORCE ---> 0(N^3)

// class Solution {
//     public int sumOddLengthSubarrays(int[] arr) {
//         int sum = 0;
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             for (int j = i ; j < n; j++) {
//                 if ((j - i + 1) % 2 == 1) {
//                     for (int k = i; k <= j; k++) {
//                         sum = sum + arr[k];
//                     }
//                 }
//             }
//         }
//         return sum;
//     }
// }