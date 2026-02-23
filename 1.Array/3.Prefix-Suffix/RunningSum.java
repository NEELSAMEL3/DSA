class RunningSum {
    public int[] runningSum(int[] nums) {
        // Create an array to store the running sum
        int[] result = new int[nums.length];
        
        // Initialize the first element
        result[0] = nums[0];
        
        // Compute the running sum for the rest of the elements
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        
        return result;
    }
}