class SplitArray {
    public int splitArray(int[] nums, int k) {
        int left = 0, right = 0;

        for (int num : nums) {
            left = Math.max(left, num); // min possible largest sum
            right += num;               // max possible largest sum
        }

        while (left < right) {
            int mid = left + (right - left) / 2; // candidate max sum
            if (canSplit(nums, k, mid)) {
                right = mid; // try smaller max sum
            } else {
                left = mid + 1; // need larger max sum
            }
        }

        return left; // minimum possible largest sum
    }

    // Helper: can we split nums into <= k subarrays with max sum <= target?
    private boolean canSplit(int[] nums, int k, int target) {
        int count = 1; // at least one subarray
        int sum = 0;

        for (int num : nums) {
            if (sum + num > target) {
                count++;    // start new subarray
                sum = 0;
            }
            sum += num;
        }

        return count <= k;
    }
}