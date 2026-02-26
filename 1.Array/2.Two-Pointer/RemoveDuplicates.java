// 26. Remove Duplicates from Sorted Array
class Solution {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int index = 1; // slow pointer

        for (int i = 1; i < nums.length; i++) { // fast pointer
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        Solution obj = new Solution();   // ✅ correct class name
        int k = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
