import java.util.*;
public class Prime {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        for(int num = x; num < y; num++) {

            if(num == 2){
                
                System.out.println(num);
            }

            if(isItPrime(num)) {
                
                System.out.println(num);
            }
        }
    }
    
    public static boolean isItPrime(int num) {
      
      boolean isPrime = true;
      int i = 2;
      int temp;
      do {
          
         temp = num % i;
         if(temp == 0){
             
             isPrime = false;
             break;
             
         }
          i++;
      } while(num > i);
          
        return isPrime;
    }
}