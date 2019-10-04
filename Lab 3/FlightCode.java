import java.util.*;
public class FlightCode { 
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 1; i > 0; i++) {
            
            String code = scan.nextLine();
            if(codeCheck(code)) {
                
                scan.close();
                System.out.println(code);
                System.out.println("Flight code is valid");
                break;
                
            } else {
                
                System.out.println(code);
                System.out.println("Flight code is NOT valid");
                
            }
        }
    }
    
    public static boolean codeCheck(String code) {
        
        boolean valid = true;
        
        if(code.matches("[A-Z][A-Z][A-Z][0-9][0-9][0-9][0-9]|[A-Z][A-Z][0-9][0-9][0-9][0-9]|[A-Z][A-Z][0-9][0-9][0-9]|[A-Z][A-Z][A-Z][0-9][0-9][0-9]")) {
            
            valid = true;
            
        } else {
            
            valid = false;        
        }
        
        return valid;
    }
}