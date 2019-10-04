import java.util.*;
public class StringAcc {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String x = new String(scan.nextLine());
        scan.close();
        
        if(trueOrFalse(x)) {
            
            System.out.println("true");
            
        } else {
            
            System.out.println("false");
        }
    }
    
    public static boolean trueOrFalse(String x) {
        
        boolean matches = true;
            
            if(x.matches("[01]*")) {
                
                matches = true;
                
            } else {
                
                matches = false;
            }
        
        return matches;
    }
}