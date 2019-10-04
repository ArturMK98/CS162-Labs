import java.util.*;
public class WeatherReport {
    
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        int temperature = scan.nextInt();
        scan.close();
        printWeatherReport(temperature);
        
    }
    
    public static void printWeatherReport(int temperature) {
        
        if(temperature >= 0 && temperature <= 8) {
            
            System.out.println("It is cold outside, bring a jacket!");
        }
        
        if(temperature >= 9 && temperature <= 16) {
            
            System.out.println("The sun is coming out, and it is getting warmer");       
        }
        
        if(temperature >= 17 && temperature <= 32) {
            
            System.out.println("Time to sit beside the pool and relax");       
        }
        
        if(temperature >= 33 && temperature <= 45) {
            
            System.out.println("Too hot, can't move!");           
        }
        
        if(temperature < 0 || temperature > 45){
            
            System.out.println("Not a valid number!");
        }
    }
}
