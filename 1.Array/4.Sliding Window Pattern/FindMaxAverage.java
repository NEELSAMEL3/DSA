// 643. Maximum Average Subarray I
public class FindMaxAverage {

    public static double findMaxAverage(int[] nums, int k) {

        int windowSum = 0;

        // Step 1: first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        int maxSum = windowSum;

        // Step 2: slide window
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i];
            windowSum -= nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = findMaxAverage(nums, k);

        System.out.println("Maximum Average Subarray = " + result);
    }
    
}
