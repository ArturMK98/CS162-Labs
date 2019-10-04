import java.util.*;
public class StringReverse {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String s = new String(scan.nextLine());
        scan.close();
        
        String sReverse = reverseString(s);
        System.out.println(sReverse);
    }
    
    public static String reverseString(String s) {
        
        if(s.isEmpty()) {
            
            return s;
        }
        
        return (reverseString(s.substring(1)) + s.charAt(0));
    }
}