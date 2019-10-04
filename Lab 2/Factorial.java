import java.util.*;
public class Factorial {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
        
        getFactorial(n, m);
    }
    
    public static void getFactorial(int n, int m) {
        
        int fact = 1;
        
        if(n < 0 || m < 0) {
            
            System.out.println("Not a valid entry!");
            
        } else {
            
            for(int i = n; i <= m; i++){
                
                fact = fact * i;
                System.out.println(fact);
                
            }
        }
    }
}