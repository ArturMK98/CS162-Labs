import java.util.*;
public class MinNumber {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        scan.close();
        miniFunction(x, y, z);
        int result = miniFunction(x, y, z);
        System.out.println(result);
        
    }
    
    public static int miniFunction(int x, int y, int z) {
        
        int smallestNumber = 0;
        if(x < y && x < z) {
            
            smallestNumber = x;
        }
        
        if(y < x && y < z) {
            
            smallestNumber = y;
        }
        
        if(z < x && z < y) {
            
             smallestNumber = z;
        }
        
        return smallestNumber;
    }
}