import java.util.*;
public class Password {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String password = new String(scan.nextLine());
        scan.close();
        int score = 0;
        score = checkPassword(password);
        if(score < 4){
            
           System.out.println("Password strength: Weak");
           
        } if(score >= 4 && score < 6) {
            
           System.out.println("Password strength: Fair");
           
        } if(score >= 6 && score < 8) {
            
           System.out.println("Password strength: Good");
           
        } if(score >= 8 && score <= 10) {
            
           System.out.println("Password strength: Strong");
        }
    }
    
    public static int checkPassword(String password){
        
        int count = 0;
        if(password.length() >= 8) {
            
            count++;
            
        }if(password.length() >= 12) {
            
            count++;
            
        }if(password.matches("(.*[a-z].*{1})")) {
            
            count++;
            
        }if(password.matches("(.*[a-z].*{2,})")) {
            
            count++;
            
        }if(password.matches("(.*[A-Z].*{1})")) {
            
            count++;
            
        }if(password.matches("(.*[A-Z].*){2,}")) {
            
            count++;
            
        }if(password.matches("(.*\\d.*){1}")) {
            
            count++;
            
        }if(password.matches("(.*\\d.*){2,}")) {
            
            count++;
            
        }if(password.matches("(.*[#!?@].*){1}")) {
            
            count++;
            
        }if(password.matches("(.*[#!?@].*){2,}")) {
            
            count++;
        }
        
        return count;
    }
}