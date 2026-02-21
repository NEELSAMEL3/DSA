class MaxProduct {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxSoFar = nums[0]; // max product ending at current position
        int minSoFar = nums[0]; // min product ending at current position
        int result = nums[0];   // overall max product

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            // When multiplied by a negative, max becomes min and min becomes max
            if (current < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            // Update maxSoFar and minSoFar
            maxSoFar = Math.max(current, maxSoFar * current);
            minSoFar = Math.min(current, minSoFar * current);

            // Update result
            result = Math.max(result, maxSoFar);
        }

        return result;
    }
}