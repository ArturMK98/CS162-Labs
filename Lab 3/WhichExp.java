import java.util.*;
public class WhichExp {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String x = new String(scan.nextLine());
        scan.close();
        
        for(int i = 0; i < x.length(); i++) {
            
            if(x.charAt(i) != 'a' && x.charAt(i) != 'b') {
                
                System.out.println("Not in the language");
                break;
            }   
        }
        
        if(expression1(x)) {
            
            System.out.println("1");
             
        }if(expression2(x)) {
            
            System.out.println("2");
            
        }if(expression3(x)) {
            
            System.out.println("3");
            
        }if(expression4(x)) {
            
            System.out.println("4");          
        }
    }
    
    public static boolean expression1(String x){
        
        boolean matches = true;
            
        if(x.matches("a(b|a)b")) {
                
            matches = true;
                
        } else {
                
             matches = false;
                
        }
            
        return matches;
    }
    
    public static boolean expression2(String x) {
        
        boolean matches = true;
            
        if(x.matches("(ab)*b")) {
            
            matches = true;
                
        } else {
                
            matches = false; 
        }
            
        return matches;
    }
    
    public static boolean expression3(String x) {
        
        boolean matches = true;
            
        if(x.matches("a(b|a)*")) {
                
            matches = true;
                
        } else {
                
            matches = false;       
        }
            
        return matches;
    }
    
    public static boolean expression4(String x) {
        
        boolean matches = true;
            
        if(x.matches("((a|b)a)*")) {
                
            matches = true;
                
        } else {
                
            matches = false;      
        }
            
        return matches;
    }
}