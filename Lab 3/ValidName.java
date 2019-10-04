import java.util.*;
public class ValidName {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 1; i > 0; i++) {
            
            String name = scan.nextLine();
            if(nameCheck(name)) {
                
                scan.close();
                System.out.println(name);
                System.out.println("Name is valid");
                break;
                
            } else {
                
                System.out.println(name);
                System.out.println("Name is NOT valid");
            }
        }
    }
    
    public static boolean nameCheck(String name) {
        
        boolean valid = true;
        
        if(name.matches("[A-Z][a-z]{1,24}")) {
            
            valid = true;
            
        } else {
            
            valid = false;    
        }
        
        return valid;
    }
}