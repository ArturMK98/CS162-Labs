import java.util.*;
public class Question2 {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String n = new String(scan.nextLine());
        //String n2 = n.substring(0, 1);
        scan.close();
        
        int count = countx(n, 0, 0);
        System.out.println("Count = " + count);
        
    }
    
    public static int countx(String n, int x, int y) {
        
        if(y == n.length()) {
            
            return x;
            
        } else if(n.charAt(y) == 'x') {
            
            return countx(n, x +1, y+1);
            
        } else {
            
            return countx(n, x, y +1);
        }
    }
}