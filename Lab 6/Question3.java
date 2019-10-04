import java.util.Scanner;
public class Question3 {
    
    public static void main(String[] args) {
       
       int[] a = fillArray();
       
       if(check2(a, 0)) {
           
            System.out.println("true");
           
       } else {
           
            System.out.println("false");
       }
    }
    
    public static int [] fillArray() {
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int [] filledArray = new int[x];

        for(int i = 0; i<filledArray.length; i++) {
            
            filledArray[i] = scan.nextInt();
        }
        
        scan.close();
        return filledArray;
    }
    
    public static boolean check2(int [] a, int x) {
        
        if(x == a.length-1 && a[x] != 2) {
            
            return false;
        
        } else if(a[x] == 2) {
            
            return true;
            
        } else {
            
            return check2(a, x +1);  
        }
    }
}