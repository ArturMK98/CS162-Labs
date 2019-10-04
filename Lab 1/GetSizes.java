import java.util.*;
public class GetSizes {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        scan.close();
        determineSize(x, y);
        
    }
    
    public static void determineSize(double x, double y) {
        
        if(x > y) {
            
            System.out.println("Largest = " + x);
            System.out.println("Smallest = " + y);
        }
        
        if(x < y) {
            
            System.out.println("Largest = " + y);
            System.out.println("Smallest = " + x);     
        }
        
        if(x == y) {
            
            System.out.println("Numbers are the same.");
            
        }
    }
}