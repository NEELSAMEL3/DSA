// 992. Subarrays with K Different Integers
import java.util.HashMap;

public class CountSubArray {

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public static int atMost(int[] nums, int k) {

        int left = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {

            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }

            count += right - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        int result = subarraysWithKDistinct(nums, k);

        System.out.println("Subarrays with exactly " + k + " distinct numbers = " + result);
    }
}
