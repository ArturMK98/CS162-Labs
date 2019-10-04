import java.util.Scanner;
public class  Question1 {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        scan.close();
        
        int ans = multiply(x, y);
        System.out.println(ans);
    }
    
    public static int multiply(int x, int y) {
        
        if(y == 0) {
            
            return 0;
            
        } else {
            
            return x + multiply(x, y -1);
        }
    }
}
