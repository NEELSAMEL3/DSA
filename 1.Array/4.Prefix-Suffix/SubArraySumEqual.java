import java.util.HashMap;

class SubArraySumEqual {
    public int subarraySum(int[] nums, int k) {
        // Map to store prefix sum frequency
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // Important: for subarrays starting at index 0

        int count = 0;
        int prefixSum = 0;

        for (int num : nums) {
            prefixSum += num;

            // Check if there is a prefixSum that satisfies (prefixSum - k)
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Update the frequency of current prefixSum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}