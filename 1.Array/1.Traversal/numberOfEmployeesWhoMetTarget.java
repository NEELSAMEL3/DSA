// 2798. Number of Employees Who Met the Target

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                count++;
            }
        }

        return count;
    }
}

public class numberOfEmployeesWhoMetTarget {
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] hours = {0, 1, 2, 3, 4};
        int target = 2;

        int result = obj.numberOfEmployeesWhoMetTarget(hours, target);

        System.out.println(result);
    }
}