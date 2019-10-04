import java.util.*;
public class Exponent {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        
        int result = powerTo(x, y);
        System.out.println(result);
    }
    
    public static int powerTo(int x, int y) {
        
        if(y == 0) {
            
            return 1;
            
        } else {
            
            return (x * powerTo(x, y -1));
        }
    }
}