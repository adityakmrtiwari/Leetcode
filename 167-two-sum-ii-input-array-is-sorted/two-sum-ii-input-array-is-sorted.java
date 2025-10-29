class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int[] ans = new int[2];
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if(numbers[i]+numbers[j]==target){
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
            else if(numbers[i]+numbers[j]<target) i++;
            else j--;
        }
        return ans;
    }
}

// class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int n = numbers.length;
//         int[] ans = new int[2];
//         for (int i = 0; i < n; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (numbers[i] + numbers[j] == target) {
//                     ans[0] = i + 1;
//                     ans[1] = j + 1;
//                 }
//             }
//         }
//         return ans;
//     }
// }