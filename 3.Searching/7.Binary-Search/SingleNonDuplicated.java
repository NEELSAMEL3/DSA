class SingleNonDuplicated {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            // Make mid even to simplify checking pairs
            if (mid % 2 == 1) mid--;

            // Check pair starting at mid
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2; // single element is after this pair
            } else {
                right = mid;    // single element is at mid or before
            }
        }

        // left == right → single element
        return nums[left];
    }
}