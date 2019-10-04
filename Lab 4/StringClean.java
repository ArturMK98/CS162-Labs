import java.util.*;
public class StringClean {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String s = new String(scan.nextLine());
        scan.close();
        
        String sNew = cleanString(s);
        System.out.println(sNew);
    }
    
    public static String cleanString(String s) {
        
        if(s.length() <= 1) {
            
            return s;
            
        } if(s.substring(1, 2).equals(s.substring(0, 1))) {
            
            return cleanString(s.substring(1));
            
        } else {
            
            return s.substring(0, 1) + cleanString(s.substring(1));
        }
    }
}