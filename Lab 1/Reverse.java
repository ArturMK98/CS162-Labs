import java.util.*;
public class Reverse {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        scan.close();
        reverseString(sentence);
        
    }
    
    public static void reverseString(String sentence) {
        
        String reverse = "";
        
        for(int i = sentence.length() -1; i >= 0; i--) {
            
            reverse += sentence.charAt(i);
        }
        
        System.out.println(reverse);
    }
}