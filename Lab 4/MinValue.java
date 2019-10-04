import java.util.*;
public class MinValue {
    
    public static void main(String args[]) {
    
    int[] a = fillArray();
    
    int minIter = minArrayIter(a);
    System.out.println(minIter);
    
    int minRec = minArrayRec(a, 0);
    System.out.println(minRec);
}

    public static int[] fillArray() {
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int [] filledArray = new int[x];
        for(int i = 0; i < filledArray.length; i++) {
            
            filledArray[i] = scan.nextInt();
        }
        
        scan.close();
        return filledArray;
    }
    
    public static int minArrayIter(int[] a) {
        
        int minValue = a[0];
        
        for(int i = 0; i < a.length; i++) {
            
            if(a[i] < minValue) {
                
                minValue = a[i];
            }
        }
        
        return minValue;
    }
    
    public static int minArrayRec(int[] a, int start) {
        
        if(start == a.length -1) {
            
            return a[start];
        }
        
        int minValue = minArrayRec(a, start + 1);
        
        if(a[start] < minValue) {
            
            return a[start];
            
        } else {
            
            return minValue;
        }
    }
}