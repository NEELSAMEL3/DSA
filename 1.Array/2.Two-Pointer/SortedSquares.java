import java.util.*;

class Solution {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {

            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                res[index--] = leftSq;
                left++;
            } else {
                res[index--] = rightSq;
                right--;
            }
        }

        return res;
    }
}

public class SortedSquares {

    public static void main(String[] args) {

        int[] nums = {-7, -3, 2, 3, 11};

        Solution obj = new Solution();
        int[] result = obj.sortedSquares(nums);

        System.out.print("Sorted Squares: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}