import java.util.*;
public class FindSubStrings {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String x = scan.nextLine();
        String m = scan.nextLine();
        int n = scan.nextInt();
        scan.close();
        
        if(checkForSub(x, m, n)) {
            
            System.out.println(true);
            
        } else {
            
            System.out.println(false);
        }
    }
    
    public static boolean checkForSub(String x, String m, int n) {
        
        if(n == 0) {
            
            return true;
            
        } else if(x.length() < m.length()) {
            
            return false;
            
        } else if(x.substring(0, m.length()).equals(m)) {
            
            return checkForSub(x.substring(1), m, n -1);
            
        } else {
            
            return checkForSub(x.substring(1), m, n); 
        }
    }
}