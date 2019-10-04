import java.util.*;
public class RemoveOdds {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        int newNum = evenDigits(n);
        System.out.println(newNum);
    }
    
    public static int evenDigits(int n) {
        
        if(n == 0) {
            
            return 0;
            
        } else if(n % 2 == 0) {
            
            return 10 * evenDigits(n / 10) + (n % 10);
            
        } else {
            
            return evenDigits(n / 10);
        }
    }
}