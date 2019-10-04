import java.util.*;
public class binarySearchGame {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int n = scan.nextInt();
        scan.close();
        
        int[] a = fillArray(x, y);
        
        int count = findNumber(a, n);
        System.out.println("The number is: " + n);
        System.out.println("It took " + count + " tries!");
        
    }
    
    public static int [] fillArray(int x, int y) {
        
        int range = (y - x) +1;
        int [] filledArray = new int[range];
        int num = x -1;
        
        for(int i = 0; i < filledArray.length; i++) {
            
            num += 1;
            filledArray[i] = num;
        }
        
        Arrays.sort(filledArray);
        return filledArray;
    }
    
    public static int findNumber(int [] a, int n) {
        
        int high = a.length -1, low = 0, middle = 0, count = 0;
        
        while(low <= high) {
            
            middle = (high + low) / 2;
            if(a[middle] > n){
                
                count++;
                high = middle -1;
                
            } else if(a[middle] < n) {
                
                count++;
                low = middle +1;
                
            } else {
                
                count++;
                break;
            }
        }
        
        return count;
    }
}