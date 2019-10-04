import java.util.*;
public class MethodsArrays {
    
    public static void main(String args[]) {
        
        fillArray();
    }
    
    public static void fillArray() {
        
        Scanner scan = new Scanner(System.in);
        int[] array = new int[scan.nextInt()];

        for(int i = 0; i < array.length; i++) {
            
            array[i] = scan.nextInt();  
        }
        
        scan.close();
        sumArray(array);
    }
    
    public static void sumArray(int array[]) {
        
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            
            sum = sum + array[i];
            
        }
        
        System.out.println("Sum = " + sum);
        avgArray(array, sum);  
    }
    
    public static void avgArray(int array[], int sum) {
        
        double average = 0;
        average = sum / array.length;
        System.out.println("Average = " + average);
        printArray(array);     
    }
    
    public static void printArray(int array[]) {
        
        for(int i = 0; i < array.length; i++) {
            
            System.out.print(array[i] + " ");
        }
    }
}