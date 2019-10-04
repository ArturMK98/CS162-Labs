import java.util.*;
public class Alarm {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String sequence = new String(scan.nextLine());
        scan.close();
        
        if(sequence.length() > 10) {
         
            System.out.println("Alarm Activated");
            
        } else if(checkSequence(sequence)) {
            
            System.out.println("Alarm Deactivated");
            
        } else {
            
            System.out.println("Alarm Activated");     
        }
    }
    
    public static boolean checkSequence(String sequence) {
        
        boolean matchingSequence = true;
        
            if(sequence.matches("[0-9]*1234[0-9]*")) {
                
            matchingSequence = true;
            
        } else {
            
            matchingSequence = false;
        }
        
        return matchingSequence;
    }
}