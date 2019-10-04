import java.util.*;
public class CountDigits {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        int count = countEights(n);
        System.out.println("Result = " + count);
        
    }
    
    public static int countEights(int n) {
        
        if(n <= 0) {
            
            return 0;
            
        } if(n % 10 == 8 && (n / 10) % 10 == 8) {
            
            return 2 + countEights(n / 10);
            
        } else if(n % 10 == 8) {
            
            return 1 + countEights(n / 10);
            
        } else {
            
            return countEights(n / 10);
        }
    }
}