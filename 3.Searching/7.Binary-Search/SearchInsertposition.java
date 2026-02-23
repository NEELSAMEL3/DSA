class SearchInsertposition {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // prevents overflow
            if (nums[mid] == target) {
                return mid; // target found
            } else if (nums[mid] < target) {
                left = mid + 1; // search in right half
            } else {
                right = mid - 1; // search in left half
            }
        }

        // If not found, left will be the insert position
        return left;
    }
}