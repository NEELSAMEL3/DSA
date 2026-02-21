class MaximumSubarray {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int maxEndHereNoDel = arr[0]; // max subarray sum ending here without deletion
        int maxEndHereDel = 0;        // max subarray sum ending here with one deletion
        int result = arr[0];          // overall maximum sum

        for (int i = 1; i < n; i++) {
            // max sum if we delete current element or extend previous deletion
            maxEndHereDel = Math.max(maxEndHereNoDel, maxEndHereDel + arr[i]);

            // max sum without deletion (standard Kadane)
            maxEndHereNoDel = Math.max(arr[i], maxEndHereNoDel + arr[i]);

            // update overall result
            result = Math.max(result, Math.max(maxEndHereNoDel, maxEndHereDel));
        }

        return result;
    }
}