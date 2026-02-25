
class Solution {

    public int[] sortArrayByParity(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            if (nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if (nums[left] % 2 == 0) {
                left++;
            }

            if (nums[right] % 2 == 1) {
                right--;
            }
        }

        return nums;
    }
}

public class SortArrayByParity {

    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 4};

        Solution obj = new Solution();
        int[] result = obj.sortArrayByParity(nums);

        System.out.print("Array after sorting by parity: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}