class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // start with first element
        
        for(int i = 0; i < nums.length; i++) {   // start index of subarray
            int total = 0;
            for(int j = i; j < nums.length; j++) { // end index of subarray
                total += nums[j];  // sum of subarray nums[i..j]
                if(total > maxSum) {
                    maxSum = total;
                }
            }
        }
        
        return maxSum;
    }
}
