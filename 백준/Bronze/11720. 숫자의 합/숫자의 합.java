import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String s = sc.next();
        char[] nums = s.toCharArray();
        
        long sum = 0;
        for(char num : nums){
            sum += (num - '0');
        }
        System.out.println(sum);
        
    }
    
}