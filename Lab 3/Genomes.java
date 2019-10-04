import java.util.*;
public class Genomes {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String genome = new String(scan.nextLine());
        scan.close();
        
        if(checkGenome(genome)) {
            
            System.out.println("true");
            
        } else {
            
            System.out.println("false");
        }
    }
    
    public static boolean checkGenome(String genome) {
        
        boolean isGenome = true;
        
        if(genome.matches("[cgat]*")) {
            
            isGenome = true;
            
        } else {
            
            isGenome = false;           
        }
        
        return isGenome;
    }
}