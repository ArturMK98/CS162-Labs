import java.util.*;
public class bubbleSortStrings {
    
    public static void main(String args[]) {
        
        String[] a = fillArray();
        
        System.out.print("Unsorted array:" + '\n');
        for(int i = 0; i < a.length ; i++) {
            
            System.out.print(a[i] + " ");
        }
        
        String [] a1 = sortArray(a, "");
        
        printArray(a1);
    }
    
    public static String [] fillArray() {
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        String [] filledArray = new String[x];
        
        for(int i = 0; i < filledArray.length; i++) {
            
            filledArray[i] = scan.next();
            
        }
        
        scan.close();
        return filledArray;
    }
    
    public static String [] sortArray(String [] a, String temp) {
        
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length -1 -i; j++) {
                
                if(a[j].compareTo(a[j + 1]) > 0) {
                     
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        
        return a;
    }
    
    public static void printArray(String [] a1) {
        
        System.out.println();
        
        System.out.print("Sorted array:" + '\n');
        for(int i = a1.length -1; i >= 0; i--) {
            
            System.out.print(a1[i] + " ");
        }
    }
}