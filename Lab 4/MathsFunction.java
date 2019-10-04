import java.util.*;
public class MathsFunction {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        int numIter = q2Iterative(n);
        System.out.println(numIter);
        
        int numRec = q2Recursive(n);
        System.out.println(numRec);     
    }
    
    public static int q2Iterative(int n) {
        
        int current = n - 1;
        int runningTotal = current;
        
        if(n == 1) {
            
            return 2;
            
        } else if(n == 2) {
            
            return 2;
            
        } else {
            
            for(int i = 2; i < n; i++) {
                
                runningTotal = 4 * current - 3 * n ;
                current = runningTotal -1;   
            }
        }
        
        return runningTotal;
    }
    
    public static int q2Recursive(int n) {
        
        if(n == 1) {
            
            return 2;
            
        } else {
            
            return(4 * q2Recursive(n - 1) - 3 * n);
        }
    }
}