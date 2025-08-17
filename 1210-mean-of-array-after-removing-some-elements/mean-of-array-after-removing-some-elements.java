class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int rem = (5*n)/100;

        int sum = 0;

        for(int i=rem ; i<n-rem;i++){
            sum=sum+arr[i];
        }

        double ans = (1.0)*sum/(n-rem*2);

        return ans;
    }
}