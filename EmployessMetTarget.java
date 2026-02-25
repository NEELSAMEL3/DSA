
import java.util.*;




public class EmployessMetTarget{
    
    public static int employeesMetTarget(int[] hours){
        int count = 0 ;

        for(int i=0;i<hours.length;i++){
            int contains = String.valueOf(hours[i]).length();

            if(contains % 2==0){
                count++;
            };
        }

        return  count; 
    };

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");

        int n = sc.nextInt();
        
        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        };

        int res = employeesMetTarget(nums);
        System.out.println(res);
        sc.close();
    };
}