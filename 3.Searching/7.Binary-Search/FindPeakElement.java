class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is less than next element, peak is in right half
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                // Peak is at mid or in left half
                right = mid;
            }
        }

        // left == right, pointing to a peak
        return left;
    }
}