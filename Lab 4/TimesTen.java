import java.util.Scanner;
public class TimesTen {
    
    public static void main(String[] args) {
         
        int [] a = fillArray();
        
        int index = 0;
        if(checkArray(a, index)) {
            
            System.out.println("true");
            
        } else {
            
            System.out.println("false");
        }
    }
	
	public static boolean checkArray(int [] a, int index) {
	    
	    if(a[index] * 10 == a[index + 1]) {
	        
	        return true;
	        
	    } if(index == a.length -2) {
	        
	        return false;
	        
	    } else {
	        
	        index++;
	        return checkArray(a, index);
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
}