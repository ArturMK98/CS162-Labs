import java.util.*;
public class OddEven {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();
        isEven(x);
        
    }
    
    public static void isEven(int x) {
        
        if(x < 0) {
            
            System.out.println("Not a valid entry!");
            
        } else if(x % 2 != 0) {
            
            System.out.println("Odd"); 

        } else if(x % 2 == 0) {
            
            System.out.println("Even");
        }
    }
}