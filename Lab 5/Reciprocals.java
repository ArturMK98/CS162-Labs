import java.util.*;
public class Reciprocals {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        double sum = sumTo(n);
        sum = Math.round(sum * 100.0) / 100.0;
        System.out.println(sum);
    }
    
    public static double sumTo(int n) {
        
        if(n == 0) {
            
            return 0.0;
            
        } else {
            
            return (1.0 / n) + sumTo(n -1);
        }
    }
}