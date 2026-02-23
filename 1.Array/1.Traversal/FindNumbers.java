// 1295. Find Numbers with Even Number of Digits 
import java.util.*;

public class FindNumbers {

    public static int findNumbers(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            int contains = String.valueOf(nums[i]).length();

            if(contains % 2 == 0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");

        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter elements: ");
        
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        int result = findNumbers(nums);

        System.out.println("Even digit numbers count: " + result);
    }
}