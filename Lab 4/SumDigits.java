import java.util.*;
public class SumDigits {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int sum = 0;
        
        sum = recursiveSum(n, sum);
        System.out.println("Result = " + sum);
    }
    
    public static int recursiveSum(int n, int sum) {
        
        if(n == 0) {
            
            return sum;
            
        } else {
            
            sum = sum + n % 10;
            n = n / 10;
            return recursiveSum(n, sum);
        } 
    }
}