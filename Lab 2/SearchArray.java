import java.util.*;
public class SearchArray {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        //String s = scan.nextLine();
        int column = row; 
        String[][] array = new String[row][column];
        
        for(int i = 0; i < row; i++){
            
            for(int j = 0; j < column; j++) {
                
                array[i][j] = scan.nextLine();           
            }
        }
        
        String word = scan.nextLine();
        scan.close();
        countStrings(array, word);
    }
    
    public static void countStrings(String array[][], String word) {
        
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            
            for(int j = 0; j < array.length; j++) {
                
                if(array[i][j].toLowerCase().equals(word.toLowerCase())) {
                    
                    count ++;
                }
            }
        }

        if(count > 0) {
            
            System.out.println(word + " is contained " + count + " times in the array");
            
        } else {
            
            System.out.println(word + " was NOT found in the array");
        }
    }
}