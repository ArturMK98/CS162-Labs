import java.util.*;
public class ValidAge {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        
        for(int i = 1; i > 0; i++){
            
            String age = scan.nextLine();
            if(valueOfAge(age)) {
            
            scan.close();
            System.out.println(age);
            System.out.println("Age is valid");
            break;
            
            } else {
            
            System.out.println(age);
            System.out.println("Age is NOT valid");
            
        }
      }
    }
    
    public static boolean valueOfAge(String age) {
        
        boolean valid = true;
        
        if(age.matches("[1-9]|[1-9][0-9]|1[0-4][0-9]") ) {
            
            valid = true;
            
        } else {
            
            valid = false;      
        }
        
        return valid;
    }
}