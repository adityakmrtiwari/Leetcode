class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> arr = new ArrayList<>();

        int n = num.length - 1;
        int c = 0;

        while (n >= 0 || k != 0 || c!=0) {
            int sum = c;
            if(n>=0) sum +=num[n--];
            if(k!=0){
                sum +=k%10;
                k/=10;
            }
            arr.add(sum%10);
            c = sum / 10;
        }
        Collections.reverse(arr);
        return arr;
    }
}