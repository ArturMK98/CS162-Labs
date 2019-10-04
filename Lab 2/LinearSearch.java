import java.util.*;
public class LinearSearch {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        double[] array = new double[scan.nextInt()];
        for(int i = 0; i < array.length; i++){
            
            array[i] = scan.nextDouble();
        }
        
        double element = scan.nextDouble();
        scan.close();
        
        if(findElement(array, element)) {
            
            System.out.println(element + " was found in the array");
            
        } else {
            
            System.out.println(element + " was NOT found in the array");
        }
    }
    
    public static boolean findElement(double array[], double element) {
        
        boolean match = true;
        for(int i = 0; i < array.length; i++) {
            
            if(array[i] == element) {
                
                match = true;
                break;
                
            } else {
                
                match = false;
            }
        }
        
        return match;
    }
}