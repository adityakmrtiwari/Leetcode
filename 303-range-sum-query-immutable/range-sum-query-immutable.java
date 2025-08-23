class NumArray {
    int [] prefix ;
    public NumArray(int[] nums) {
        prefix= new int[nums.length];

        prefix[0]=nums[0];

        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0) return prefix[right];
        return prefix[right] - prefix[left-1];
    }
}



// class NumArray {
//     int [] nums ;
//     public NumArray(int[] nums) {
//         this.nums=nums;
//     }
    
//     public int sumRange(int left, int right) {
//         int sum =0;

//         for(int i=left;i<=right;i++){
//             sum +=nums[i];
//         }
//         return sum;
//     }
// }

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */